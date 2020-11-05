package serenitylabs.tutorials.seleniumeasy.serenity.forms.solutions;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class TestingInputForms extends WithSerenity {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void openPage() {
        openDemoPage("basic-first-form-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a message in the Single Input Field and check that it is shown

        $("#user-message").sendKeys("Hello world");
        $("#get-input button").click();

        assertThat($("#display").getText()).isEqualTo("Hello world");
    }


    @Test
    public void enterTwoValues() {
        // TODO: Enter a number in each input field and verify the calculated total

        // Enter value for A: 1
        $("#sum1").sendKeys("1");
        // Enter value for B: 2
        $("#sum2").sendKeys("2");
        // Click on the Get Total button
        $("#gettotal button").click();

        // Check that the result is equal to 3
        assertThat($("#displayvalue").getText()).isEqualTo("3");
    }

}
