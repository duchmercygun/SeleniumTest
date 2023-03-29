package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        //goto google.com
        driver.get("https://www.google.com/");
        //maximize the window
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        //close
        driver.close();

    }
}
