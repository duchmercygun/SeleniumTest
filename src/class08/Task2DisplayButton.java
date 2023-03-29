package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2DisplayButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='display-other-button']")));

        //Task2 Display button after 10 seconds
        WebElement displayButton=driver.findElement(By.xpath("//button[@id='hidden']"));
        boolean isEnabled= displayButton.isEnabled();
        System.out.println("Display button is enabled "+isEnabled);



    }
}
