package org.SeleniumFramework.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertionHelper {
    private final WebDriver driver;

    public AssertionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void verifyText(WebElement locator, String expectedText) {
        String actualText = locator.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void verifyElementPresent(WebElement locator) {
        boolean isDisplayed = locator.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

}
