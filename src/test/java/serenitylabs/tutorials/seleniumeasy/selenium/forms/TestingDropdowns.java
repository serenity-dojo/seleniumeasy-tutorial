package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        Select select = new Select(driver.findElement(By.id("select-demo")));
        select.selectByVisibleText("Monday");

        String selectedValue = driver.findElement(By.cssSelector(".selected-value")).getText();
        assertThat(selectedValue).isEqualTo("Day selected :- Monday");
    }

    @Test
    public void multiSelect() {
        // TODO: Select California","New York",and "Washington" in the dropdown

        Select select = new Select(driver.findElement(By.id("multi-select")));
        select.selectByVisibleText("California");
        select.selectByVisibleText("New York");
        select.selectByVisibleText("Washington");

        List<String> selectedOptions = select.getAllSelectedOptions()
                .stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());

        assertThat(selectedOptions).containsExactly("California","New York","Washington");


    }
}
