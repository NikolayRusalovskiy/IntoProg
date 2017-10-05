package adminConsole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminElemContains {
    WebDriver driver = new ChromeDriver();

//    AdminElemContains(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }

    public WebDriver getDriver() {
        return driver;
    }

    @FindBy(name = "username")
    WebElement loginItem;
    @FindBy(name = "password")
    WebElement passItem;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitItem;

    WebElement formElement = driver.findElement(By.id("box-apps-menu"));
    List<WebElement> allFormChildElements = formElement.findElements(By.xpath("*"));




    public void doLogin (String login, String pass){
        driver.get("http://localhost/litecart/admin/login.php");
        loginItem.sendKeys(login);
        passItem.sendKeys(pass);
        submitItem.click();
    }

    public List<WebElement> getAllFormChildElements() {
        return allFormChildElements;
    }
}
