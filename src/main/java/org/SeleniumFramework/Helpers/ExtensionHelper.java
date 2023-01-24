package org.SeleniumFramework.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class ExtensionHelper {
    private WebDriver driver;

    public ExtensionHelper (WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }
    public String getTitle() {
        return driver.getTitle();
    }
}