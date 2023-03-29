package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement createNew=driver.findElement(By.cssSelector("a[data-testId='open-registration-form-button']"));
        createNew.click();
        Thread.sleep(2000);
        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("Duchess");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Novales");
    }
}
