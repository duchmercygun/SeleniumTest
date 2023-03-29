package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);//declaration of the wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));//Maximum time it's going to wait

        //once the element is visible then get the text
        WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText= text.getText();
        System.out.println(WelcomeText);

    }
}
