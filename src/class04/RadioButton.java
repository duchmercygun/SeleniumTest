package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement male=driver.findElement(By.cssSelector("input[value='Male']"));
        boolean isEnabled=male.isEnabled();
        System.out.println("The radio button male in enabled "+isEnabled);
        boolean isDisplayed=male.isDisplayed();
        System.out.println("The male button is displayed "+isDisplayed);
        boolean isSelectedMale=male.isSelected();
        System.out.println("The male button is selected "+isSelectedMale);

        if(!isSelectedMale){
            male.click();
        }
        isSelectedMale= male.isSelected();
        System.out.println("The status of isSelected is "+isSelectedMale);
    }
}
