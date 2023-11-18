package day01_seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverOlusturma {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        /*
        bu satir olusturacagimiz webdririn öz.set ediyor
        wedriver otomas.sirasinda  bizim elimiz kolumuz

         */
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
        driver.quit();



    }
}
