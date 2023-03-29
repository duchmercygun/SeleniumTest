package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDynamic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        //Task: check the checkbox containing the product screensaver
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        //iterate through each to see if it contains screensaver
        for (int i = 0; i < column.size(); i++) {
            //extract the text
            String text=column.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")){
                System.out.println(text);
                System.out.println("The screensaver is located at row number "+i+2);
                System.out.println("Check the check box");
               WebElement checkBox=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));
               checkBox.click();
            }
        }
    }
}
