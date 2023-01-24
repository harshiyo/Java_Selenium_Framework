package org.SeleniumFramework.Helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class WebdriverHelper {
    public WebDriver createDriver() {
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("start-maximized");
        optionsChrome.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(optionsChrome);
    }
}