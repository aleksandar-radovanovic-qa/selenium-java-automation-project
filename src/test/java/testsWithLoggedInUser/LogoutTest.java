package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testsWithLoggedInUser.BaseTestWithLogin;

public class LogoutTest extends BaseTestWithLogin {
    @Test
    public void logoutTest(){
        HomePage homePage = new HomePage(driver);
        homePage.performLogout();
        Assert.assertEquals(homePage.readProfileName(), "Vaš nalog");
    }
}