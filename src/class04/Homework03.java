package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        WebElement enterText=driver.findElement(By.xpath("//input[contains(@id,'user-message')]"));
        enterText.sendKeys("Hello");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput')]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'sum1')]")).sendKeys(String.valueOf(5));
        driver.findElement(By.xpath("//input[contains(@id,'sum2')]")).sendKeys(String.valueOf(10));
        driver.findElement(By.xpath("//button[contains(@onclick,'return')]")).click();
        WebElement total=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        System.out.println(total.getText());

        // in order to print all the elements we need iterator
        List<WebElement> attributes= driver.findElements(By.xpath("//button[@onclick='return total()']"));
        for (WebElement atts:attributes) {
            String link=atts.getAttribute("return total()");
            System.out.println(link);
        }



    }
}
