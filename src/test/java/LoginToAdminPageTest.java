
import pages.AdminPanelPage;
import pages.LoginToAdminPage;
import Utils.DriverFactory;
import org.junit.*;


public class LoginToAdminPageTest {

    private final String appLink = "http://localhost/litecart/admin/login.php";
    private final String username = "admin";
    private final String password = "admin";

    @Before
    public void setup() {
        DriverFactory.getDriver().get(appLink);
    }

    @Test
    public void loginAdminPage() {
        new LoginToAdminPage().loginAsUser(username, password);
    }
@Test
    public void checkThatAdminPanel(){
    new LoginToAdminPage().loginAsUser(username, password);
    new AdminPanelPage();
    Assert.assertTrue(new AdminPanelPage().isHeaderPresent());
}
//
//    @After
//    public void tearDown() {
//        DriverFactory.getDriver().quit();
//    }
}