package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");

    }
}
