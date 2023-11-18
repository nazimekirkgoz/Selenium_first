package day04_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_path_textKullanimi {
    public static void main(String[] args) throws InterruptedException {



        /* 1- https://testotomasyonu.com/addremove/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        */


        System.setProperty("WebDriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://testotomasyonu.com/addremove/ adresine gidin
        driver.get(" https://testotomasyonu.com/addremove/");

        //Add Element butonuna basin
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add']"));
        addButton.click();

        //removenbutonu’nun gorunur oldugunu test edin
        WebElement removebutonu = driver.findElement(By.xpath("//button[text()='Remove']"));
        if (removebutonu.isDisplayed()) {
            System.out.println("deleteElement testi PASSED");
        } else System.out.println("deleteElement testi FAILED");

        //Remove tusuna basin
        removebutonu.click();
        Thread.sleep(5000);
        //  “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemove = driver.findElement(By.xpath("//*[@class='container']"));
        if (addRemove.isDisplayed()) {
            System.out.println("addRemove testi PASSED");
        } else System.out.println("addRemove testi FAILED");
        Thread.sleep(2000);
        //Remove butonunun olmadigini test edin


        if (removebutonu.isDisplayed()) {
            System.out.println("Special offer testi PASSED");
        } else System.out.println("Special offer testi FAILED");


        driver.quit();

    }
}
