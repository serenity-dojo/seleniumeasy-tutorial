package serenitylabs.tutorials.seleniumeasy.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public abstract class WithWebdriverSupport {

    @FindBy
    private final String SELENIUM_EASY_DEMO_SITE = "https://demo.seleniumeasy.com/";

    protected WebDriver driver;

    @BeforeClass
    static public void setupWebDriver() {
        // NOTE: WebDriverManager is not required for Selenium 4
        // WebDriverManager.chromedriver().setup();
    }

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    protected void open(String page) {
        driver.get(SELENIUM_EASY_DEMO_SITE + page);
    }
}
