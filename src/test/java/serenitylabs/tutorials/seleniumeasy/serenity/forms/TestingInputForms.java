package serenitylabs.tutorials.seleniumeasy.serenity.forms;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class TestingInputForms extends WithSerenity {

    @Before
    public void openPage() {
        openDemoPage("basic-first-form-demo.html");
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

        // Enter value for A: 1
        // Enter value for B: 2
        // Click on the Get Total button

        // Check that the result is equal to 3
        String displayedValue = ""; // TODO: Fix me

        assertThat(displayedValue).isEqualTo("3");
    }

}
