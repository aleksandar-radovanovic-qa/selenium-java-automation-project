package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealizovanaPorudzbinaPage extends BasePage{
    public RealizovanaPorudzbinaPage(WebDriver driver) {
        super(driver);
    }
    By orderConfirmationBy = By.className("sec-title__brend");
    public String orderConfirmationText(){
        return readTextFromElement(orderConfirmationBy);
    }
}
