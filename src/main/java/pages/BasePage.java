package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitVisibility(By elementLocator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementLocator));
    }

    public void waitClickability(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void clickElement(By elementLocator) {
        waitVisibility(elementLocator);
        driver.findElement(elementLocator).click();
    }

    public void clickElement(WebElement elementToClick) {
        waitClickability(elementToClick);
        elementToClick.click();
    }

    public void writeText(By elementLocator, String text) {
        waitVisibility(elementLocator);
        driver.findElement(elementLocator).clear();
        driver.findElement(elementLocator).sendKeys(text);
    }

    public String readTextFromElement(By elementLocator) {
        waitVisibility(elementLocator);
        return driver.findElement(elementLocator).getText();
    }

    public int readNumberFromElement(By elementLocator) {
        waitVisibility(elementLocator);
        String text = driver.findElement(elementLocator).getText();
        int broj = Integer.parseInt(text);
        return broj;
    }

    public String readAttributeValue(By elementLocator, String attributeName) {
        waitVisibility(elementLocator);
        return driver.findElement(elementLocator).getAttribute(attributeName);
    }

    public WebElement selectRandomWebElement(By elementLocator) {
        waitVisibility(elementLocator);
        List<WebElement> webElementList = driver.findElements(elementLocator);
        if (webElementList.isEmpty()) {
            throw new SkipException("No available items in store.");
        }
        Random random = new Random();
        int size = webElementList.size();
        int selection = random.nextInt(size);
        return webElementList.get(selection);
    }

    public boolean isElementNotDisplayed(By elementLocator) {
        if (driver.findElements(elementLocator).size() > 0) {
            return false;
        }
        return true;
    }
}