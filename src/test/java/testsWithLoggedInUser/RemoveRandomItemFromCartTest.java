package testsWithLoggedInUser;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KorpaPage;

public class RemoveRandomItemFromCartTest extends BaseTestWithLogin{
    @Test
    public void removeRandomItemFromCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProdavnicaPage().addRandomToCart().removeItemFromCart();
        int bezItema = 0;
        Thread.sleep(500);
        Assert.assertEquals(new KorpaPage(driver).readNumberOfItemsFromCart(), bezItema);
    }
}
