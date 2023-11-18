package day04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class fgfg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","\"src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu.com anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        // electronics linkine tiklayin
        driver.findElement(By.xpath("(//a[text()='Electronics'])[3]")).click();
        //kenarda bulunan fiyat filtresine min 10, max 200 yazarak
        WebElement minKutusu= driver.findElement(By.cssSelector("input[class='form-control minPrice']"));
        WebElement maxKutusu= driver.findElement(By.cssSelector("input[class='form-control maxPrice']"));
        minKutusu.clear();
        minKutusu.sendKeys("10");
        maxKutusu.clear();
        maxKutusu.sendKeys("200");
        //filtreleme yapin
        driver.findElement(By.xpath("//button[text()='Filter Price']")).click();

        //arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi=driver.findElement(By.cssSelector(".product-count-text"));
        System.out.println(aramaSonucElementi.getText());
        String aramaSonucuStr = aramaSonucElementi.getText().replaceAll("\\D",""); // "11"
        int actualSonucSayisi =  Integer.parseInt(aramaSonucuStr); // int olarak 11
        if (actualSonucSayisi > 0){
            System.out.println("Filtreleme testi PASSED");
        }else System.out.println("Filtreleme testi FAILED");
        //sayfayi kapatin.
        driver.quit();

    }
}
