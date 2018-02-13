package model.importData;

import UI.Components.AlertWindows;
import model.importData.Data.Data;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class ImportData {

    WebDriver driver;

    public ImportData() {

        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.download.folderList", 2);
        firefoxProfile.setPreference("browser.download.dir", "c:\\aktier");
        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
        firefoxProfile.setPreference("pdfjs.disabled", true);
        FirefoxBinary fp = new FirefoxBinary();
        FirefoxOptions opt = new FirefoxOptions();
        opt.setBinary(fp);
        opt.setProfile(firefoxProfile);

        driver = new FirefoxDriver(opt);
        driver.get("http://www.nasdaqomxnordic.com/aktier/historiskakurser");

    }

    public void deleteOld() {
        try {
            FileUtils.cleanDirectory(new File("C:\\Aktier"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void downloadAll() throws InterruptedException {

        WebElement timeField = driver.findElement(By.id("FromDate"));
        timeField.clear();
        Date referenceDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(referenceDate);
        c.add(Calendar.MONTH, -4);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        timeField.sendKeys(format1.format(c.getTime()));
        WebElement nameField = driver.findElement(By.id("instSearchHistorical"));
        nameField.sendKeys(Data.stockName[1][0]);
        Thread.sleep(1000);

        try {

            driver.findElement(By.xpath("//*[contains(text(), '" + Data.stockName[1][1] + "')]")).click();
            driver.findElement(By.id("exportExcel")).click();
            Thread.sleep(10000);

            for (int i = 2; i < 94; i++) {

                try {
                    nameField.clear();
                    nameField.sendKeys(Data.stockName[i][0]);
                    Thread.sleep(500);
                    driver.findElement(By.xpath("//*[contains(text(), '" + Data.stockName[i][2] + "')]")).click();
                    driver.findElement(By.id("exportExcel")).click();
                }

                catch (Exception e) {
                    try{
                        //Trying again
                        nameField.clear();
                        nameField.sendKeys(Data.stockName[i][0]);
                        Thread.sleep(1000);
                        driver.findElement(By.xpath("//*[contains(text(), '" + Data.stockName[i][2] + "')]")).click();
                        driver.findElement(By.id("exportExcel")).click();
                    }
                    catch (Exception d){

                        if(AlertWindows.chooseBox("Download failed for: " + Data.stockName[i][0] + " / " + Data.stockName[i][2] +"/n " + "Would you like to restart download?") == true){
                            driver.close();
                            downloadAll();
                        }else {

                            driver.close();
                            AlertWindows.infoBox("Download did not finished");
                        }
                    }
                    nameField.clear();
                }
            }

            driver.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Kunde inte slutföra nedladdning");
            driver.close();
        }


        //Check how many files

    }






}
