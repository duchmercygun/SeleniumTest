package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        // driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //find the webElement userName
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        //To highlight the userName box

        //1. Declare the instance
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //execute the script
        js.executeScript("arguments[0].style.border='3px solid purple'",userName); // write the script/code inside()

        //find the webElement of logIn button
       WebElement btnLgn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        //how to do the click
        js.executeScript("arguments[0].click();",btnLgn);
    }
}
