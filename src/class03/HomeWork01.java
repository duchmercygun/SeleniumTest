package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Duchess");
        driver.findElement(By.name("customer.lastName")).sendKeys("Novales");
        driver.findElement(By.id("customer.address.street")).sendKeys("Oxford Way");
        driver.findElement(By.name("customer.address.city")).sendKeys("Beverly Hills");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("90210");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("571-123-4567");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("duch123");
        driver.findElement(By.id("customer.password")).sendKeys("0911");
        driver.findElement(By.id("repeatedPassword")).sendKeys("0911");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
