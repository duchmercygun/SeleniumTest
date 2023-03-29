package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableHomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        WebElement pimBtn = driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
        pimBtn.click();
        WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();

        //get the employee ID 52396A and check on the checkBox associated with it
        //in order to find the desired id
        boolean idFound = false;
        while (!idFound) {
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("52097A")) {
                    System.out.println(id);
                    System.out.println("ID is on the row " + i);
                    System.out.println("check the box");
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }
            }
            //click on the next page if the first condition is false
            if(!idFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}