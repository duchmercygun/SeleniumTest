package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        // Tell your project where the webDriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //Open the website google.com
        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser
        String URL=driver.getCurrentUrl();

        // print out the url
        System.out.println(URL);

        //get the title of the webpage
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        //slow down for 3 seconds
        Thread.sleep(3000);

        //close the browser we can use driver.quit(); or driver.close();
        driver.quit();
    }
}