package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    @Test
    public void emptyUsernameTest(){
        HomePage homePage = new HomePage(driver);
        homePage.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
        Assert.assertEquals(homePage.readProfileName(), "Petar");
    }
}
