package model.importData;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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


        Thread.sleep(300);

        try {

            driver.findElement(By.xpath("//*[contains(text(), '" + Data.stockName[1][0] + "')]")).click();

            driver.findElement(By.id("exportExcel")).click();

            Thread.sleep(10000);

            /*Alert alert = new Alert(Alert.AlertType.WARNING, "I Warn You!", ButtonType.OK, ButtonType.CANCEL);
            DialogPane root = alert.getDialogPane();

            Stage dialogStage = new Stage(StageStyle.UTILITY);
            root.getScene().setRoot(new Group());
            root.setPadding(new Insets(10, 0, 10, 0));
            Scene scene = new Scene(root);

            dialogStage.setScene(scene);
            dialogStage.initModality(Modality.APPLICATION_MODAL);
            dialogStage.setAlwaysOnTop(true);
            dialogStage.setResizable(false);
            dialogStage.show();*/



            for (int i = 2; i < 94; i++) {

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
          /*  dialogStage.close();*/

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Kunde inte slutföra nedladdning");
            driver.close();
        }

    }






}
