package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdavnicaPage extends BasePage{
    public ProdavnicaPage(WebDriver driver) {
        super(driver);
    }
    By allItemsBy = By.xpath("//div[contains(@class, 'product-prev__item')]");
    By addItemToCart = By.xpath("//a[contains(@class, 'btn-fill btn-green btn-icon-first')]");
    By pogledajteKorpuBy = By.xpath("//*[@id=\"cart-modal\"]/div[1]/div/a[2]");
    public KorpaPage addRandomToCart() throws InterruptedException {
        clickElement(selectRandomWebElement(allItemsBy));
        clickElement(addItemToCart);
        clickElement(pogledajteKorpuBy);
        Thread.sleep(1000);
        return new KorpaPage(driver);
    }

}
