package serenitylabs.tutorials.seleniumeasy.serenity.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class TestingAjaxForms extends WithSerenity {

    @Before
    public void openPage() {
        openDemoPage("ajax-form-submit-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a name and comment, and wait until the success message appears

        $("#title").type("A message");
        $("#description").type("A comment");

        $("#btn-submit").click();

        waitFor(not(textToBePresentInElementLocated(By.id("submit-control"),"Ajax Request is Processing!")));
// OR:  waitForAbsenceOf("//*[@id='submit-control'][contains(.,'Ajax Request is Processing!')]");

        assertThat($("#submit-control").getText()).contains("Form submited Successfully!");
    }

}
