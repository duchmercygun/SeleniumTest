package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement option : checkBoxes) {
            String choices = option.getAttribute("value");
            if (choices.equalsIgnoreCase("Option-2")) {
                option.click();
            }
        }
    }
}