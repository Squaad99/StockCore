package importData;

import Data.Data;
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
import java.nio.file.Path;
import java.text.SimpleDateFormat;

import java.util.Arrays;
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

        nameField.sendKeys(Data.stockName[0][0]);


        Thread.sleep(3000);

        try {

            driver.findElement(By.xpath("//*[contains(text(), '" + Data.stockName[0][0] + "')]")).click();

            driver.findElement(By.id("exportExcel")).click();

            Thread.sleep(10000);

            for (int i = 1; i < 94; i++) {

                try {
                    nameField.clear();
                    nameField.sendKeys(Data.stockName[i][0]);

                    Thread.sleep(500);

                    driver.findElement(By.xpath("//*[contains(text(), '" + Data.stockName[i][2] + "')]")).click();
                    driver.findElement(By.id("exportExcel")).click();

                }

                catch (Exception e) {
                    System.out.println(e + Data.stockName[i][0] + " Hittades ej");
                    nameField.clear();
                }

            }

            driver.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Kunde inte slutföra nedladdning");
            driver.close();
        }

    }




}
