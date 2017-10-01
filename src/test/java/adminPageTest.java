import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminPageTest {
    @Test
    public void loginAdminPage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/litecart/admin/login.php");
        WebElement loginItem = driver.findElement(By.xpath("//*[@name='username']"));
        loginItem.sendKeys("admin");
        WebElement passItem = driver.findElement(By.xpath("//*[@name='password']"));
        passItem.sendKeys("admin");
        WebElement submitItem = driver.findElement(By.xpath("//*[@type='submit']"));
        submitItem.click();
        driver.quit();
    }
}
