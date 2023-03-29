package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSampleGetFranciscoChang {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //TASK 1: Print the whole table element in the console
        //WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        //String tableData= table.getText();
        List<WebElement> printName=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2+1]/td[2]"));

        //Get column 3
        for (WebElement name:printName
             ) {
            System.out.println(name.getText());
        }


        }

    }

