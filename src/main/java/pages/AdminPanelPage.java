package pages;

import Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPanelPage {

    @FindBy(id="box-apps-menu")
    WebElement side_menu_container;

    public boolean isHeaderPresent(){
        return isElementPresent(By.tagName("h1"));
    }

    public boolean isElementPresent(By locator){
        return !DriverFactory.getDriver().findElements(locator).isEmpty();
    }

    public List<WebElement> getSide_menu_container(){
        return side_menu_container.findElements(By.id("app-"));
    }
}
