package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingRadioButtons extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-radiobutton-demo.html");
    }

    @Test
    public void singleRadio() {
        // TODO: Click on the second radio and click on 'Get Checked Value' - check that the correct text is displayed.

        String checkedValue = "";
        assertThat(checkedValue).isEqualTo("Radio button 'Female' is checked");
    }

}
