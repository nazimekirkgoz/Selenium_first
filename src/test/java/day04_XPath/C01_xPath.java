package day04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xPath {
    public static void main(String[] args) throws InterruptedException {
       /* 1- https://testotomasyonu.com/addremove/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        */


        System.setProperty("WebDriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://testotomasyonu.com/addremove/ adresine gidin
        driver.get(" https://testotomasyonu.com/addremove/");

        //Add Element butonuna basin
        WebElement addButton =driver.findElement(By.id("sub-btn"));
        addButton.click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteElement= driver.findElement(By.xpath("//*[@class='remove-btn']"));
        if (deleteElement.isDisplayed()){
            System.out.println("deleteElement testi PASSED");
        }else System.out.println("deleteElement testi FAILED");

        //Delete tusuna basin
       WebElement removeButonu= driver.findElement(By.xpath("//*[@class='remove-btn']"));
        Thread.sleep(5000);

         //  “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         WebElement addRemove= driver.findElement(By.xpath("//*[@class='container']"));
        if (addRemove.isDisplayed()){
            System.out.println("addRemove testi PASSED");
        }else System.out.println("addRemove testi FAILED");
        Thread.sleep(2000);

        //Remove butonunun olmadigini test edin
        try {
            removeButonu= driver.findElement(By.xpath("//*[@class='remove-btn']"));
        } catch (NoSuchElementException e) {
            System.out.println("remove butonu görünmeme testi passed");
        }

        if (removeButonu.isDisplayed()){//
            System.out.println("addRemove testi PASSED");
        }else System.out.println("addRemove testi FAILED");




        driver.quit();

    }
}
