package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //find all the age group radio buttons
        //the xPath here that  is common to all webElements that has age group

        List<WebElement> radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //iterate over the list to see your desired one
        for(WebElement radioBtn:radioBtns){
            String age=radioBtn.getAttribute("value");
            //If the value of the WebElement is 5-15 click on it
            if(age.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }
        }
    }
}
