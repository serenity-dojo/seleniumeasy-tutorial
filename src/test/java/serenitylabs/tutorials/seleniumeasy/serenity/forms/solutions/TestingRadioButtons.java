package serenitylabs.tutorials.seleniumeasy.serenity.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingRadioButtons extends WithSerenity {

    @Before
    public void openPage() {
        openDemoPage("basic-radiobutton-demo.html");
    }

    @Test
    public void singleRadio() {
        // TODO: Click on the second radio and click on 'Get Checked Value' - check that the correct text is displayed.

        $("css:input[value='Female']").click();
        $("#buttoncheck").click();

        assertThat($(".radiobutton").getText()).isEqualTo("Radio button 'Female' is checked");
    }

}
