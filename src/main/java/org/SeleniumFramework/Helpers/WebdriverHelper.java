package org.SeleniumFramework.Helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.SeleniumFramework.Config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebdriverHelper {
    public WebDriver createDriver(String browser) {

        ConfigReader config = new ConfigReader();
        String isHeadless = config.getProperty("headless");
        if (browser.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            if (isHeadless.equals("true")) {
                options.addArguments("--headless");
            }
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if (isHeadless.equals("true")) {
                options.addArguments("--headless");
            }
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver(options);
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        else {
            throw new IllegalArgumentException("Invalid browser name provided: " + browser);
        }
    }
    }
