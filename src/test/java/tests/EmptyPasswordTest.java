package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.PropertyManager;

public class EmptyPasswordTest extends BaseTest{
    @Test
    public void emptyPasswordTest(){
        HomePage homePage = new HomePage(driver);
        homePage.performLogin(PropertyManager.getInstance().getValidEmail(), "");
        Assert.assertEquals(homePage.readPasswordErrorText(), "Polje je obavezno.");
    }
}
