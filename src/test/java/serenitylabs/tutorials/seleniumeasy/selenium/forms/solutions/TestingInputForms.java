package serenitylabs.tutorials.seleniumeasy.selenium.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingInputForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-first-form-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a message in the Single Input Field and check that it is shown

        driver.findElement(By.id("user-message")).sendKeys("Hello world");
        driver.findElement(By.cssSelector("#get-input button")).click();

        assertThat(driver.findElement(By.id("display")).getText()).isEqualTo("Hello world");
    }

    @Test
    public void enterTwoValues() {
        // TODO: Enter a number in each input field and verify the calculated total

        // Enter value for A: 1
        driver.findElement(By.name("sum1")).sendKeys("1");
        // Enter value for B: 2
        driver.findElement(By.name("sum2")).sendKeys("2");
        // Click on the Get Total button
        driver.findElement(By.cssSelector("#gettotal button")).click();

        // Check that the result is equal to 3
        assertThat(driver.findElement(By.id("displayvalue")).getText()).isEqualTo("3");
    }
}
