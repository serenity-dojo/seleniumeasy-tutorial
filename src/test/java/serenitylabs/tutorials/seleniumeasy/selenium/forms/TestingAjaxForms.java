package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class TestingAjaxForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("ajax-form-submit-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        driver.findElement(By.id("title")).sendKeys("Harry");
        driver.findElement(By.id("description")).sendKeys("The comment is here");
        driver.findElement(By.id("btn-submit")).click();
        //Creating an instance of WebDriverWait specifying the maximum time you want to wait:
        WebDriverWait wait = new WebDriverWait(driver, 5);

        String expectedText = "Form submited Successfully!";
        wait.until(textToBePresentInElementLocated(By.id("submit-control"), expectedText));
        //OR
        //wait.until(not(textToBePresentInElementLocated(By.id("submit-control"), "Ajax Request is Processing!")));

        String resultMessage = driver.findElement(By.id("submit-control")).getText();
        assertThat(resultMessage).contains("Form submited Successfully!");
    }

}
