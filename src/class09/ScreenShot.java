package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       // driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        //Take screenshot
        TakesScreenshot ss=(TakesScreenshot) driver;
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        //save the file in the computer
        FileUtils.copyFile(sourceFile,new File("/Users/crizzynicdao/IdeaProjects/SeleniumTest/src/screenshot/webOrder.png"));
    }
}
