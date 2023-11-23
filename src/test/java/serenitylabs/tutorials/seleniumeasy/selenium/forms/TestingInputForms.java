package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static io.vavr.API.$;
import static org.assertj.core.api.Assertions.assertThat;

public class TestingInputForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-first-form-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // DONE: Enter a message in the Single Input Field and check that it is shown -
        driver.findElement(By.id("user-message")).sendKeys("Selenium easy");
        driver.findElement(By.cssSelector("#get-input button")).click();
        String displayedText = driver.findElement(By.id("display")).getText();

        assertThat(displayedText).isEqualTo("Selenium easy");
    }

    @Test
    public void enterTwoValues() {
        // DONE: Enter a number in each input field and verify the calculated total
        driver.findElement(By.id("value1")).sendKeys("3");
        driver.findElement(By.id("value2")).sendKeys("2");
        driver.findElement(By.cssSelector("#gettotal button")).click();

        String displayedValue = driver.findElement(By.id("displayvalue")).getText();

        assertThat(displayedValue).isEqualTo("5");
    }
}
