package testsWithLoggedInUser;

import dataGenerator.DataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KorpaPage;
import pages.RealizovanaPorudzbinaPage;
import utilities.PropertyManager;

public class ItemPurchaseTest extends BaseTestWithLogin{
    @Test
    public void itemPurchaseTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProdavnicaPage()
                .addRandomToCart()
                .porucivanje()
                .clickOnFizickoLice()
                .fillCheckoutDetails(
                        DataGenerator.generateFirstName(),
                        DataGenerator.generateLastName(),
                        DataGenerator.generateEmailAddress(),
                        DataGenerator.generateAdresa(),
                        DataGenerator.generateBrojStana(),
                        DataGenerator.generateSprat(),
                        DataGenerator.generatePostanskiBroj(),
                        DataGenerator.generateNaselje(),
                        DataGenerator.generateOpstina(),
                        DataGenerator.generateGrad(),
                        DataGenerator.generateBrojTelefona(),
                        DataGenerator.generateDodatneInformacije());
        Thread.sleep(10000);

        Assert.assertEquals(new RealizovanaPorudzbinaPage(driver).orderConfirmationText(), "VAŠA PORUDŽBINA JE POSLATA");
    }
}
