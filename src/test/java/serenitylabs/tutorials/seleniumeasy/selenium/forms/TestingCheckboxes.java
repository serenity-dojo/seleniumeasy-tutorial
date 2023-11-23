package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingCheckboxes extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-checkbox-demo.html");
    }

    @Test
    public void singleCheckbox() {
        driver.findElement(By.id("isAgeSelected")).click();
        String result = driver.findElement(By.id("txtAge")).getText();
        assertThat(result).isEqualTo("Success - Check box is checked");
    }

    @Test
    public void multipleCheckboxes() {
        driver.findElements(By.cssSelector(".cb1-element")).forEach(WebElement::click);
        String result = driver.findElement(By.id("check1")).getAttribute("value");
        assertThat(result).isEqualTo("Uncheck All");
    }
}
