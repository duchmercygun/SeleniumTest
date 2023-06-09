package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

     WebElement draggable = driver.findElement(By.id("draggable"));
     WebElement droppable=driver.findElement(By.id("droppable"));
        //action class
       Actions action=new Actions(driver);
       action.dragAndDrop(draggable,droppable).perform();
    }
}
