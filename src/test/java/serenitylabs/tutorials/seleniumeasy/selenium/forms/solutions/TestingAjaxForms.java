package serenitylabs.tutorials.seleniumeasy.selenium.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
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

        driver.findElement(By.id("title")).sendKeys("A message");
        driver.findElement(By.id("description")).sendKeys("A comment");

        driver.findElement(By.id("btn-submit")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(Exception.class);

        wait.until(not(textToBePresentInElementLocated(By.id("submit-control"),"Ajax Request is Processing!")));

        assertThat(driver.findElement(By.id("submit-control")).getText()).contains("Form submited Successfully!");
    }

}
