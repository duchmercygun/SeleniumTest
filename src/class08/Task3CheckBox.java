package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task3CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkbox']")));

        //Task3 Check box
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        boolean isChecked= checkBox.isEnabled();
        System.out.println("Check box is checked "+isChecked);
    }
}
