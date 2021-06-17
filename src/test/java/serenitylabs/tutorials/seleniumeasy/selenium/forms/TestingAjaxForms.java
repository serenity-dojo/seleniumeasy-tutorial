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

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Test");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("Comments");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit-control")));



        String resultMessage = driver.findElement(By.id("submit-control")).getText();
        assertThat(resultMessage).contains("Form submited Successfully!");
    }

}
