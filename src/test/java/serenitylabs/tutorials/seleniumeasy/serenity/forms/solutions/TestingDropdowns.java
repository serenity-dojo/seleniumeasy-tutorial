package serenitylabs.tutorials.seleniumeasy.serenity.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingDropdowns extends WithSerenity {

    @Before
    public void openPage() {
        openDemoPage("basic-select-dropdown-demo.html");
    }

    @Test
    public void simpleSelectList() {
        // TODO: Select a day and check that the result is correctly displayed

        $("#select-demo").selectByVisibleText("Monday");

        assertThat($(".selected-value").getText()).isEqualTo("Day selected :- Monday");
    }

    @Test
    public void multiSelect() {
        // TODO: Select several entries in a list
        $("#multi-select").selectByVisibleText("California")
                .selectByVisibleText("New York")
                .selectByVisibleText("Washington");

        // Check that all of the selected values were selected
        assertThat($("#multi-select").getSelectedValues()).containsExactly("California", "New York", "Washington");
    }
}
