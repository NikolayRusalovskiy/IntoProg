import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminPageTest {
    @Test
    public void loginAdminPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/litecart/admin/login.php");

////        xPath
//        WebElement loginItem = driver.findElement(By.xpath("//*[@name='username']"));
//       WebElement passItem = driver.findElement(By.xpath("//*[@name='password']"));
//        WebElement submitItem = driver.findElement(By.xpath("//*[@type='submit']"));

//        Простой локатор
        WebElement loginItem = driver.findElement(By.name("username"));
        WebElement passItem = driver.findElement(By.name("password"));
        WebElement submitItem = driver.findElement(By.xpath("//*[@type='submit']"));

        loginItem.sendKeys("admin");
        passItem.sendKeys("admin");
        submitItem.click();
//        driver.quit();
    }
}
