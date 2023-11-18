package Selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    public static void main(String[] args) {
        /*. .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de” adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/” adresine gidip
9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim

         */
        //1-Driver oluşturalim
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        //2-Java class'imiza chnomedriver.exet i tanitalim
        WebDriver driver=new ChromeDriver();
        //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().fullscreen();
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        //5-"https://www.otto.de” adresine gidelim
        driver.get("https://www.otto.de");
        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoUrl=driver.getCurrentUrl();
       String ottoTitle= driver.getTitle();
       if (ottoTitle.contains("OTTO")&& ottoUrl.contains("OTTO")){
           System.out.println("Title and url Passed");
       }else {
           System.out.println("Title and url Failed");
          //8- "https://wisequarter.com/” adresine gidip
           driver.get("https://wisequarter.com/");
           //9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
           String wqTitle=driver.getTitle();
           boolean kelime=wqTitle.contains("Quarter");
           System.out.println(wqTitle);
           if (kelime){
               System.out.println("Passed");
           }else {
               System.out.println("failed");
           }
           //10-Bir onceki web sayfamiza geri donelim
           driver.navigate().back();
           driver.navigate().refresh();
           driver.navigate().forward();


           driver.quit();
       }




    }
}
