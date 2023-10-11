//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Duration;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class testIsA {
//
//    WebDriver driver;
//
//    @BeforeAll
//    static void driverSetup() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void driver() {
//
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    void productDisplayed() {
//        driver.get("http://192.168.11.6");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.findElement(By.cssSelector(".dropdown:nth-of-type(8) [data-bs-toggle]")).click();
//        driver.findElement(By.cssSelector(".dropdown-menu.show > .see-all")).click();
//        driver.findElement(By.cssSelector("button#button-list > .fa-th-list.fas")).click();
//
//
//        WebElement iPodClassic = driver.findElement(By.linkText("iPod Classic"));
//        assertTrue(iPodClassic.isDisplayed());
//
//        iPodClassic.click();
//    }
//
//
//}