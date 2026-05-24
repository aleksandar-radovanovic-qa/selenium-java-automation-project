package tests;

import common.BrowserSetup;
import org.testng.annotations.*;
import utilities.PropertyManager;

public class BaseTest extends BrowserSetup {
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("Chrome") String browser) {
        switch(browser.toLowerCase()){
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
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}