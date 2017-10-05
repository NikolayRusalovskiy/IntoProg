package adminConsole;

import org.junit.Test;


public class TitlePage {


    MainPage mainPage = new MainPage(MainPage.getDriver() );


 @Test
    public void openTitlePage() {
     mainPage.openPage("http://localhost/litecart/");

     mainPage.myStore.isDisplayed();
     mainPage.regionLocate.isDisplayed();
     mainPage.quantity.isDisplayed();
     mainPage.searchLine.isDisplayed();
     mainPage.categories.isDisplayed();
     mainPage.email.isDisplayed();
     mainPage.password.isDisplayed();
     mainPage.submit.isDisplayed();
     mainPage.newCustomerLink.isDisplayed();

    }


//
}
