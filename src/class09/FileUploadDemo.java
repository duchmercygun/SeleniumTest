package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("/Users/crizzynicdao/Desktop");
        driver.findElement(By.xpath("//input[@value='Upload']")).click();
    }
}
