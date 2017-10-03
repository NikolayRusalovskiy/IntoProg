import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class titlePage {
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

    @Test
    public void openTitlePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/litecart/");
//        WebElement myStore = driver.findElement(By.xpath("//*[@title='My Store']"));
//        WebElement regionLocate = driver.findElement(By.className("country"));
//        WebElement quantity = driver.findElement(By.className("quantity"));
//        WebElement searchLine = driver.findElement(By.name("query"));
//        WebElement categories = driver.findElement(By.className("category-1"));
//        WebElement email = driver.findElement(By.name("email"));
//        WebElement password = driver.findElement(By.name("password"));
//        WebElement submit = driver.findElement(By.name("login"));
//        WebElement newCustomerLink = driver.findElement(By.xpath("//a[contains(@href,'http://localhost/litecart/en/create_account')]" ));

        myStore.isDisplayed();
        regionLocate.isDisplayed();
        quantity.isDisplayed();
        searchLine.isDisplayed();
        categories.isDisplayed();
        email.isDisplayed();
        password.isDisplayed();
        submit.isDisplayed();
        newCustomerLink.isDisplayed();

    }
}
