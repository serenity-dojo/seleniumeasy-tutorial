package serenitylabs.tutorials.seleniumeasy.serenity;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithSerenity extends UIInteractionSteps {

    private final String SELENIUM_EASY_DEMO_SITE = "https://www.seleniumeasy.com/test/";
    private final By LIGHTBOX_CLOSE_ICON = By.id("at-cv-lightbox-close");

    protected void openDemoPage(String page) {
        this.openUrl(SELENIUM_EASY_DEMO_SITE + page);
    }

}
