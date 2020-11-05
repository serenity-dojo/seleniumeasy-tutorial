package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class TestingAjaxForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("ajax-form-submit-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a name and comment, and wait until the success message appears

        String resultMessage = null;
        assertThat(resultMessage).contains("Form submited Successfully!");
    }

}
