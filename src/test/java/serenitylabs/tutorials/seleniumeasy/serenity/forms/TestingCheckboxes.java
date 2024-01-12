package serenitylabs.tutorials.seleniumeasy.serenity.forms;

import org.junit.Before;
import org.junit.Test;
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

        String result = ""; // TODO: Fix me
        assertThat(result).isEqualTo("Success - Check box is checked");
    }

    @Test
    public void multipleCheckboxes() {
        // TODO: Click on all the checkboxes and ensure that the button text is "Uncheck All"

        String result = ""; // TODO: Fix me
        assertThat(result).isEqualTo("Uncheck All");

    }
}
