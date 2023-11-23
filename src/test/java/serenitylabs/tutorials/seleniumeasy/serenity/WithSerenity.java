package serenitylabs.tutorials.seleniumeasy.serenity;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

import java.time.Duration;

public class WithSerenity extends UIInteractionSteps {

    private final String SELENIUM_EASY_DEMO_SITE = "https://demo.seleniumeasy.com/";

    protected void openDemoPage(String page) {
        this.openUrl(SELENIUM_EASY_DEMO_SITE + page);
    }

}
