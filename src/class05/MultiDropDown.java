package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select=new Select(DD);
        //select by Value
        select.selectByValue("New Jersey");
        //select by visible text
        select.selectByVisibleText("Ohio");
        Thread.sleep(2000);

        //when it comes to multi select dropdown, we can also deselect
        select.deselectByValue("New Jersey");

        //check if dropDown is multiple
        System.out.println("The drop down is multiple "+select.isMultiple());


    }
}
