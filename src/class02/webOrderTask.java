package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();// always maximize the screen
        driver.findElement(By.id("ct100_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ct100$MainContent$password")).sendKeys("Test");
        driver.findElement(By.className("button")).click();
    }
}
