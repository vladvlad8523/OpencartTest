import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Login extends BaseDriver {

    @Test
    public void registerClick() {

        driver.findElement(By.cssSelector(".list-inline-item:nth-of-type(2) .d-md-inline")).click();
        driver.findElement(By.xpath("//div[@class='nav float-end']//ul//ul/li/a")).click();

        /**
         * formos pildimas
         */
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Tom1");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Jery1");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("tom@jery.gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456789");
        /**
         * funkcijapuslapio scrolinimui i apacia
         */
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        /**
         * perjungimas/(sutikimas) Privacy Policy
         */

        driver.findElement(By.cssSelector("input[name='agree']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();


    }
}