package serenitylabs.tutorials.seleniumeasy.serenity.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;
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
        $("input[value='Female']").click();
        $("#buttoncheck").click();

//        $("css:input[value='Female']").click();
//        $("#buttoncheck").click();

//        String checkedValue = $(".radiobutton").getText();
//        assertThat(checkedValue).isEqualTo("Radio button 'Female' is checked");
    }

}