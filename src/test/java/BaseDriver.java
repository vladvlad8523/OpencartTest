import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseDriver {
    private final static String BASE_URL = ("http://192.168.11.6"); //konstanta
    public WebDriver driver;
//    public void firstOpencart() {
//
//        WebDriverManager.chromedriver().setup(); //automatinis driverio parinkimas pagal narsikles versija
//
//        Configuration.browser = "chrome"; //driveris narsiklei chrome
//
//        Configuration.driverManagerEinabled = true; //draiverio ijungimas
//
//        Configuration.browserSize = "1680x1050"; //narsikles didzio nustatymas
//
//        Configuration.handless = false; //ar matysim narsikles langa testo metu naudojama serveriui


        @BeforeEach
        public void init () {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(BASE_URL); //atidarom tinklalapi
        }
        @AfterEach
        public void tearDown () {
            driver.quit();
        }
//    }
}

