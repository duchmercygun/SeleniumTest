package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement helloWorld=driver.findElement(By.xpath("//button"));
        helloWorld.click();
        WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        String  hello=text.getText();
        System.out.println("Text is displayed "+hello);



    }
}
