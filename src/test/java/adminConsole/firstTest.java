package adminConsole;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class firstTest {
    @Test
    public void laptopIsPresentOnThePage() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//WebDriverWait wait = new WebDriverWait(driver,5).until();
        driver.get("http://rozetka.com.ua/");
       Thread.sleep(30000);
//        WebElement menuItem =driver.findElement(By.id ("2416"));
        WebElement menuItem = driver.findElement(By.xpath("//*[@id=\"2416\"]/a"));
        menuItem.click();
        Thread.sleep(30000);
        WebElement asus = driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/notebooks/c80004/filter/v004/']"));
        asus.click();
    driver.quit();
    }

}
