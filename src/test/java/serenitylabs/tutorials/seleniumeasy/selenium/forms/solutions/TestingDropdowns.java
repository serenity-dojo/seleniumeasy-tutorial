package serenitylabs.tutorials.seleniumeasy.selenium.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingDropdowns extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-select-dropdown-demo.html");
    }

    @Test
    public void simpleSelectList() {
        // TODO: Select a day and check that the result is correctly displayed

        new Select(driver.findElement(By.id("select-demo"))).selectByVisibleText("Monday");

        assertThat(driver.findElement(By.className("selected-value")).getText()).isEqualTo("Day selected :- Monday");
    }

    @Test
    public void multiSelect() {
        // TODO: Select several entries in a list
        new Select(driver.findElement(By.id("multi-select"))).selectByVisibleText("California");
        new Select(driver.findElement(By.id("multi-select"))).selectByVisibleText("New York");
        new Select(driver.findElement(By.id("multi-select"))).selectByVisibleText("Washington");

        // Check that button label is 'Uncheck All'
        List<String> selectedOptions = new Select(driver.findElement(By.id("multi-select")))
                .getAllSelectedOptions()
                .stream().map(element -> element.getAttribute("value"))
                .collect(Collectors.toList());
        assertThat(selectedOptions).containsExactly("California","New York","Washington");
    }
}
