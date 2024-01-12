package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingAjaxForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("ajax-form-submit-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a name and comment, and wait until the success message appears

        String resultMessage = null;
        assertThat(resultMessage).contains("Form submited Successfully!");
    }

}
