/**
 * pagrindinis puslapis: http://192.168.11.6
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class OpencartTest extends BaseDriver{

        //private final static String BASE_URL = ("http://192.168.11.6"); //konstanta

    @Test
        public void search() throws InterruptedException {

            WebElement clickMp3 = driver.findElement(By.linkText("MP3 Players")); //pasirenkam menu
            clickMp3.click();
            WebElement selrctMp3 = driver.findElement(By.linkText("Show All MP3 Players")); //pasirenkam player sarasa
            selrctMp3.click();
            WebElement Mp3Player = driver.findElement(By.xpath("//div/form/div/div/a")); //formos pasirinkimas
            Mp3Player.sendKeys(Keys.ENTER);
            WebElement addToCard = driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block")); //pridedam k krepsi
            addToCard.submit();
        /**
         * preke prideta i krepseli baigta
         * einam i systema apsipirkt
         */
        driver.findElement(By.cssSelector("button.btn-close")).click();
        WebElement Ikrepselis = driver.findElement(By.cssSelector(".btn.btn-lg.btn-inverse.btn-block.dropdown-toggle")); //atidarom krepseli
        Ikrepselis.click();
        Thread.sleep(5000);
        WebElement openCardShopping = driver.findElement(By.xpath("//a[@title='Shopping Cart']"));
        openCardShopping.click(); //apzvalga turimu prekiu
    }

}