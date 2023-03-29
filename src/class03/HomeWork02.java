package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Duchess");
        driver.findElement(By.name("lastname")).sendKeys("Novales");
        driver.findElement(By.name("reg_email__")).sendKeys("duch123@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Abc123");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.className("_8idr img")).click();
        driver.close();



    }
}
