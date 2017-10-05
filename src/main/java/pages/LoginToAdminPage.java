package pages;

import Utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToAdminPage {


    @FindBy(name = "username")
    WebElement loginItem;
    @FindBy(name = "password")
    WebElement passItem;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement submitItem;


    public void loginAsUser(String login, String password) {
        loginItem.sendKeys(login);
        passItem.sendKeys(password);
        submitItem.click();
    }


    public LoginToAdminPage() {
                PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}

