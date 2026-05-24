package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KorpaPage extends BasePage{
    public KorpaPage(WebDriver driver) {
        super(driver);
    }
    By izbaciItemBy = By.xpath("//button[contains(@id, 'remove')]");
    By potvrdIzbaciItemBy = By.xpath("/html/body/div[2]/div/div[1]/div/div/button[2]");
    By korpaBy = By.id("header_cart_num");
    By porucivanjeBy = By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div/div[2]/div/form/div/button");
    public void removeItemFromCart(){
        clickElement(izbaciItemBy);
        clickElement(potvrdIzbaciItemBy);
    }
    public int readNumberOfItemsFromCart(){
        return readNumberFromElement(korpaBy);
    }
    public PorucivanjePage porucivanje(){
        clickElement(porucivanjeBy);
        return new PorucivanjePage(driver);
    }
}
