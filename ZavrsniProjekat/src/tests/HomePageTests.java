package tests;

import org.junit.Test;

import pages.HomePage;

public class HomePageTests extends BaseTest {
    
    @Test

    public void OpenHomePage () {
        HomePage homePage = new HomePage(driver);
        homePage.goToBaseUrl();
    }
    
}
