package day04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        /*// testotomasyonu.com anasayfaya gidin

// electronics linkine tiklayin

// kenarda bulunan fiyat filitresinde
// min 10, max 200 yazarak filtreleme yapin
// arama sonucunda urun bulunabildigini test edin

// sayfayi kapatin

         */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        // testotomasyonu.com anasayfaya gidin

// electronics linkine tiklayin

// kenarda bulunan fiyat filitresinde
// min 10, max 200 yazarak filtreleme yapin
// arama sonucunda urun bulunabildigini test edin

// sayfayi kapatin
         */
        // testotomasyonu.com anasayfaya gidin
        driver.get("https://testotomasyonu.com");
        // electronics linkine tiklayin
        WebElement elektronik=driver.findElement(By.linkText("Electronics"));
        elektronik.click();
// min 10, max 200 yazarak filtreleme yapin
       WebElement min= driver.findElement(By.className("form-control minPrice"));
       min.clear();
       min.sendKeys("10");
       WebElement max= driver.findElement(By.className("form-control maxPrice"));
       max.clear();
       max.sendKeys("200");
        // arama sonucunda urun bulunabildigini test edin
      WebElement element=  driver.findElement(By.className("product-count-text"));
        System.out.println(element.getText());
        String expectedsonuc=element.getText().replaceAll("//D","");
        int actuallsonuc=Integer.parseInt(expectedsonuc);
        if (actuallsonuc>0){
            System.out.println("Passed");

        }else {
            System.out.println("failed");
        }

driver.quit();

      }






    }

