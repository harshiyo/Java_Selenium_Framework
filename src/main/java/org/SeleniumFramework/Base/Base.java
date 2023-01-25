package org.SeleniumFramework.Base;
import org.SeleniumFramework.Config.ConfigReader;
import org.SeleniumFramework.Helpers.ExtensionHelper;
import org.SeleniumFramework.Helpers.WebdriverHelper;
import org.SeleniumFramework.Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Base {
    protected static WebDriver driver;
    protected ExtensionHelper extensionHelper;
    @BeforeMethod
    public void preTest() {
        ConfigReader config = new ConfigReader();
        driver = new WebdriverHelper().createDriver(config.getProperty("browser"));
        driver.manage().window().maximize();
        driver.get(Constants.base_url);
        extensionHelper = new ExtensionHelper(driver);
    }
    @AfterMethod
    public void postTest(){
        driver.quit();
    }
}