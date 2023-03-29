package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // get all the links from amazon with tag a
        //let's use the locator tagName
       List<WebElement> tags= driver.findElements(By.tagName("a"));// in order to print all the elements we need iterator
        for (WebElement tag:tags) {
            String link=tag.getAttribute("href");
            System.out.println(link);
        }



    }
}
