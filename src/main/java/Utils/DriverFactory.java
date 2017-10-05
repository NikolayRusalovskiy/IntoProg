package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final Integer timeoutInSeconds = 5;
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null) {
             driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);
            return driver;
        }
        return driver;
    }

}
