package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1SeleniumWebDriverText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));

        //Task1 Change text to Selenium WebDriver
        WebElement text=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        String printText= text.getText();
        System.out.println(printText);

        //Task2 Display button after 10 seconds


    }
}
