package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;

public class RacksAndContainersDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        //Task: Print all the entries that has MyMoney product
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

        //Iterate
        //Tell me the row number of money in the table on the website

        for (int i = 0; i < column.size(); i++) {
            String text=column.get(i).getText();
            if(text.equalsIgnoreCase("FamilyAlbum")){
                System.out.println("money is in the list on index "+i);
                System.out.println("money is in the table on index "+(i+2));
                driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]")).click();
            }

        }

    }
}
