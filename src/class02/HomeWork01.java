package class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {

    /*
    1. Launch the browser
    2. navigate to amazon website
    3. print out the title and the URL in the console
    4. close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        String URL=driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();

    }
}
