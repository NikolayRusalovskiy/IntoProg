package adminConsole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    static WebDriver driver = new ChromeDriver();

    @FindBy(xpath = "//*[@title='My Store']")
    WebElement myStore;

    @FindBy(className = "country")
    WebElement regionLocate;

    @FindBy(className = "quantity")
    WebElement quantity;

    @FindBy(name = "query")
    WebElement searchLine;

    @FindBy(className = "category-1")
    WebElement categories;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "login")
    WebElement submit;

    @FindBy(xpath = "//a[contains(@href,'http://localhost/litecart/en/create_account')]")
    WebElement newCustomerLink;

    MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void loginAs(String login, String password) {
        email.clear();
        email.sendKeys(login);
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void openPage(String url) {
        driver.get(url);
    }

}

