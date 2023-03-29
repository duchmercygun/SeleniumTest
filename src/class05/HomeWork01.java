package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean isBoxSelected= checkBox.isSelected();
        System.out.println("Check box is selected "+isBoxSelected);
        if(!isBoxSelected){
            checkBox.click();
        }
        isBoxSelected= checkBox.isSelected();
        System.out.println("The status of checkbox is "+isBoxSelected);
    }
}
