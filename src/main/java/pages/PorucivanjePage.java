package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PorucivanjePage extends BasePage{
    public PorucivanjePage(WebDriver driver) {
        super(driver);
    }
    By registerButtonBy = By.id("register_btn");
    By fizickoLiceBy = By.id("fizicka_lica_btn");
    By imeBy = By.id("ime");
    By prezimeBy = By.id("prezime");
    By emailAdresaBy = By.id("email");
    By adresaBy = By.id("adresa");
    By brojStanaBy = By.id("stan");
    By spratBy = By.id("sprat");
    By postanskiBrojBy = By.id("po_broj");
    By naseljeBy = By.id("naselje");
    By opstinaBy = By.id("opstina");
    By gradBy = By.id("grad");
    By brojTelefonaBy = By.id("telefon");
    By dodatneInformacijeBy = By.id("additional-text");
    public PorucivanjePage clickOnFizickoLice(){
        clickElement(fizickoLiceBy);
        return this;
    }
    public PorucivanjePage fillCheckoutDetails(
            String fName, String lName, String postalCode, String adresa,
            String brojStana, String sprat, String postanskiBroj, String naselje,
            String opstina, String grad, String brojTelefona, String dodatneInformacije){
        writeText(imeBy, fName);
        writeText(prezimeBy, lName);
        writeText(emailAdresaBy, postalCode);
        writeText(adresaBy, adresa);
        writeText(brojStanaBy, brojStana);
        writeText(spratBy, sprat);
        writeText(postanskiBrojBy, postanskiBroj);
        writeText(naseljeBy, naselje);
        writeText(opstinaBy, opstina);
        writeText(gradBy, grad);
        writeText(brojTelefonaBy, brojTelefona);
        writeText(dodatneInformacijeBy, dodatneInformacije);
        //clickElement(registerButtonBy);
        return this;
    }
}
