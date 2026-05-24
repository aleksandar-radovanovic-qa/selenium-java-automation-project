package testsWithLoggedInUser;

import common.BrowserSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.HomePage;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BrowserSetup {
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("Chrome") String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                startChrome();
                break;
            case "firefox":
                startFirefox();
                break;
            case "edge":
                startEdge();
                break;
            default:
                startChrome();
                System.out.println("Desired browser not supported, started tests on Chrome.");
        }
        driver.get(PropertyManager.getInstance().getUrl());
        HomePage homePage = new HomePage(driver);
        homePage.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
