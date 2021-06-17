package serenitylabs.tutorials.seleniumeasy.serenity;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@RunWith(SerenityRunner.class)
public class WithSerenity extends UIInteractionSteps {

    @Managed(driver = "chrome")
    WebDriver driver;

    private final String SELENIUM_EASY_DEMO_SITE = "https://www.seleniumeasy.com/test/";

    protected void openDemoPage(String page) {
        this.openUrl(SELENIUM_EASY_DEMO_SITE + page);
    }

}
