package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.PropertyManager;

public class InvalidCredentialsTest extends BaseTest{
    @Test
    public void invalidCredentialsTest(){
        HomePage homePage = new HomePage(driver);
        homePage.performLogin(PropertyManager.getInstance().getInvalidEmail(), PropertyManager.getInstance().getInvalidPassword());
        Assert.assertEquals(homePage.readProfileName(), "Vaš nalog");
    }
}
