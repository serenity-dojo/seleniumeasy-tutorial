package serenitylabs.tutorials.seleniumeasy.selenium.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingCheckboxes extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-checkbox-demo.html");
    }

    @Test
    public void singleCheckbox() {
        // TODO: Click on the first checkbox and check that a success message is displayed

        driver.findElement(By.id("isAgeSelected")).click();

        assertThat(driver.findElement(By.id("txtAge")).getText()).isEqualTo("Success - Check box is checked");
    }

    @Test
    public void multipleCheckboxes() {
        // TODO: Click on all the checkboxes and ensure that the button text is "Uncheck All"

        // Check all the checkboxes
        driver.findElements(By.cssSelector(".cb1-element")).forEach(WebElement::click);

        // Check that button label is 'Uncheck All'
        assertThat(driver.findElement(By.id("check1")).getAttribute("value")).isEqualTo("Uncheck All");
    }
}
