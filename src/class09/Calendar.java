package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.delta.com");

        //click on the calendar
        WebElement calendar= driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();
        //get the month from the calendar
        WebElement month= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        //get on the next
        WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));

        //click on the next button until you find the right month
        boolean isFound=false;
        while (!isFound){
            String month_= month.getText();
            if(month_.equalsIgnoreCase("January")){
                //select the day
                List<WebElement> days=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day:days) {
                    String day_text= day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }
            } else {
                next.click();
            }
        }
    }
}
