package Selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class P06 {
    public static void main(String[] args) throws InterruptedException {
       /* ..Exercise3...
        Navigate to  https://testpages.herokuapp.com/styled/index.html
        Click on  Calculater under Micro Apps
        Type any number in the first input
        Type any number in the second input
        Click on Calculate
        Get the result
        Print the result

        */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get(" https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps

      //  WebElement calculateclick= driver.findElement(By.id("calculatetest"));
        //calculateclick.click();
        // Click on  Calculater under Micro Apps
       driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("number1")).sendKeys("1258");
       driver.findElement(By.id("number2")).sendKeys("2536");
       driver.findElement(By.className("styled-click-button")).click();

       System.out.println("islem sonucu="+ driver.findElement(By.xpath("//*[@id='answer']")).getText());


       /*  driver.findElement(By.id("number1")).sendKeys("1258");
            driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("2536");
            driver.findElement(By.id("calculate")).click();
            System.out.println("İşlem Sonucu = " + driver.findElement(By.id("answer")).getText());




        */

        driver.quit();



    }
}
