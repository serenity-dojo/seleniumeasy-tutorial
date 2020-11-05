package serenitylabs.tutorials.seleniumeasy.serenity.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingCheckboxes extends WithSerenity {

    @Before
    public void openPage() {
        openDemoPage("basic-checkbox-demo.html");
    }

    @Test
    public void singleCheckbox() {
        // TODO: Click on the first checkbox and check that a success message is displayed

        $("#isAgeSelected").click();

        assertThat($("#txtAge").getText()).isEqualTo("Success - Check box is checked");
    }

    @Test
    public void multipleCheckboxes() {
        // TODO: Click on all the checkboxes and ensure that the button text is "Uncheck All"

        // Select all of the checkbox
        $$(".cb1-element").forEach(WebElement::click);

        // Check that button label is 'Uncheck All'
        assertThat($("#check1").getValue()).isEqualTo("Uncheck All");
    }
}
