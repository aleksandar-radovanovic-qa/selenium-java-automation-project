package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By vasNalogBy = By.id("user_account_popup_link");
    By usernameFieldBy = By.name("user_email");
    By passwordFieldBy = By.name("user_pass");
    By prijavaButtonBy = By.name("prijava");
    By odjavaButtonBy = By.name("odjava");
    By imeProfilaBy = By.xpath("//*[@id=\"user_account_popup_link\"]/span");
    By prodavnicaMenuBy = By.xpath("//*[@id=\"site-menu\"]/div/ul[1]/li[2]/a");
    By sviProizvodiBy = By.xpath("//*[@id=\"site-menu\"]/div/ul[1]/li[2]/ul/li/div/div/div/div[1]/ul/li[1]/a");
    By errorUsernameBy = By.id("user_email-error");
    By errorPasswordBy = By.id("user_pass-error");

    public void performLogin(String email, String password) {
        clickElement(vasNalogBy);
        writeText(usernameFieldBy, email);
        writeText(passwordFieldBy, password);
        clickElement(prijavaButtonBy);
    }
    public void performLogout(){
        clickElement(vasNalogBy);
        clickElement(odjavaButtonBy);
    }
    public String readUsernameErrorText(){
        return readTextFromElement(errorUsernameBy);
    }
    public String readPasswordErrorText(){
        return readTextFromElement(errorPasswordBy);
    }
    public String readProfileName(){
        return readTextFromElement(imeProfilaBy);
    }
    public ProdavnicaPage navigateToProdavnicaPage(){
        clickElement(prodavnicaMenuBy);
        clickElement(sviProizvodiBy);
        return new ProdavnicaPage(driver);
    }
}
