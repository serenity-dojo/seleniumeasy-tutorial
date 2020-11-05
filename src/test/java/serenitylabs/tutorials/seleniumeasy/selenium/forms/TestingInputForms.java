package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Ignore;
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

        String displayedText = ""; // TODO: Fix me

        assertThat(displayedText).isEqualTo("Hello world");
    }

    @Test
    public void enterTwoValues() {
        // TODO: Enter a number in each input field and verify the calculated total

        String displayedValue = ""; // TODO: Fix me

        assertThat(displayedValue).isEqualTo("3");
    }
}
