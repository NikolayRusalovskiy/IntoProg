package adminConsole;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AdminPageTest extends AdminElemContains {
//    AdminPageTest(WebDriver driver) {
//        super(driver);
//    }

    @Test
    public void loginAdminPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/litecart/admin/login.php");
       loginItem.sendKeys("admin");
        passItem.sendKeys("admin");
        submitItem.click();
//        driver.quit();
    }
    @Test
    public void checkHeader(){

        doLogin("admin","admin");
        getAllFormChildElements().iterator();
    }



}
