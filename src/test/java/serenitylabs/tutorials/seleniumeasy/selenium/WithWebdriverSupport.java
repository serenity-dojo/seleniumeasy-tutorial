package serenitylabs.tutorials.seleniumeasy.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public abstract class WithWebdriverSupport {

    @FindBy
    private final String SELENIUM_EASY_DEMO_SITE = "https://www.seleniumeasy.com/test/";

    protected WebDriver driver;

    @BeforeClass
    static public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
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
