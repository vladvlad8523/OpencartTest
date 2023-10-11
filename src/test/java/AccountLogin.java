import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountLogin extends BaseDriver {
    @Test
    public void acountLogin() {
        driver.findElement(By.cssSelector(".list-inline-item:nth-of-type(2) .d-md-inline")).click();
        driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right.show > li:nth-of-type(2) > .dropdown-item")).click();
        /**
         * login in account
         */
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("tom@jery.gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456789");
        password.submit();

    }
}