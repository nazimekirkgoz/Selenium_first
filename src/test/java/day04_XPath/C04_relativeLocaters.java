package day04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_relativeLocaters {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://https://testotomasyonu.com/relativeLocators./ adresine gidin
        driver.get(" https://testotomasyonu.com/relativeLocators/");

        WebElement dslrCamera = driver.findElement(By.id("pic7_thumb"));
        dslrCamera.click();

       WebElement motorE13Elementi= driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(dslrCamera));
          //https://testotomasyonu.com/uploads/product/1688033137
        WebElement hpvictuselementi= driver.findElement(RelativeLocator.with(By.id("pictext12")).below(dslrCamera));
 String expected="1688033137";
 String actualatributevalue=hpvictuselementi.getAttribute("src");
 if( actualatributevalue.contains(actualatributevalue)){
            System.out.println("passed");

        }else {
     System.out.println("failed");
 }



        driver.quit();
    }
}
