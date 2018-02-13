
import model.importData.Data.Data;
import model.importData.ImportData;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
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

/**
 * Created by Henrik Berglund on 2018-02-01.
 */
public class ImportTest {

    @Test
    public void deleteOldFiles(){
        try {
            FileUtils.cleanDirectory(new File("C:\\Aktier"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    WebDriver driver;

    @Test
    public void testSpecific() throws  InterruptedException{

        //Enter the name that you wanna test here
        String fullName = "Mr Green & Co";
        String shortName = "MRG";

        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.download.folderList", 2);
        firefoxProfile.setPreference("browser.download.dir", "c:\\aktierTestDownload");
        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
        firefoxProfile.setPreference("pdfjs.disabled", true);
        FirefoxBinary fp = new FirefoxBinary();
        FirefoxOptions opt = new FirefoxOptions();
        opt.setBinary(fp);
        opt.setProfile(firefoxProfile);
        driver = new FirefoxDriver(opt);
        driver.get("http://www.nasdaqomxnordic.com/aktier/historiskakurser");

        WebElement timeField = driver.findElement(By.id("FromDate"));
        timeField.clear();

        Date referenceDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(referenceDate);
        c.add(Calendar.MONTH, -4);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        timeField.sendKeys(format1.format(c.getTime()));

        WebElement nameField = driver.findElement(By.id("instSearchHistorical"));

        nameField.sendKeys(fullName);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[contains(text(), '" + fullName + "')]")).click();

        driver.findElement(By.id("exportExcel")).click();

    }

    @Test
    public void testAll() throws InterruptedException {

        Data data = new Data();

        ImportData importData = new ImportData();
        importData.deleteOld();
        importData.downloadAll();

    }

}
