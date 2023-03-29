package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandled {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get window handle
       String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //get window handles of all the windows that have been opened
        Set<String> windowHandles=driver.getWindowHandles();
        //print all the window handles
        for (String wh:windowHandles
             ) {//switch the focus of the driver to help window
            driver.switchTo().window(wh);
            //check the title of the window to the current focus of the driver
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("")){
                break;
            }


            driver.switchTo().window(parentWindowHandle);
        }
        //to verify we switched the account
        System.out.println(driver.getTitle());
    }
}
