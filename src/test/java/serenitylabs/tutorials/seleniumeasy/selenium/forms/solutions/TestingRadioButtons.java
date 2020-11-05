package serenitylabs.tutorials.seleniumeasy.selenium.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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

        driver.findElement(By.cssSelector("input[value='Female']")).click();
        driver.findElement(By.id("buttoncheck")).click();

        assertThat(driver.findElement(By.cssSelector(".radiobutton")).getText()).isEqualTo("Radio button 'Female' is checked");
    }

}
