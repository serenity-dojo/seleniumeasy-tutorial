package serenitylabs.tutorials.seleniumeasy.serenity.forms;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;


@RunWith(SerenityRunner.class)
public class TestingAjaxForms extends WithSerenity {

    @Managed(driver = "chrome")
    WebDriver driver;
    //driver.SetProperty("webdriver.chrome.drive,C:\\Automation\\driver\\e\\chromedriver.exe")

    @Before
    public void openPage() {
        openDemoPage("ajax-form-submit-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a name and comment, and wait until the success message appears

        String resultMessage = null;
        assertThat(resultMessage).contains("Form submited Successfully!");
    }

}
