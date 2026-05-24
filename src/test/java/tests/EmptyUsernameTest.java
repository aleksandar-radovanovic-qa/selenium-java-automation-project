package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.PropertyManager;

public class EmptyUsernameTest extends BaseTest{
    @Test
    public void emptyUsernameTest(){
        HomePage homePage = new HomePage(driver);
        homePage.performLogin("", PropertyManager.getInstance().getValidPassword());
        Assert.assertEquals(homePage.readUsernameErrorText(), "Polje je obavezno.");
    }
}
