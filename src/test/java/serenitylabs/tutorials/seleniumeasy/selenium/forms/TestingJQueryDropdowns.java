package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingJQueryDropdowns extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("jquery-dropdown-search-demo.html");
    }

    @Test
    public void selectingInADropdownWithASearchBox() {
        // TODO: Click on the dropdown then select 'New Zealand' in the dropdown

        String selectedCountry = "";

        assertThat(selectedCountry).isEqualTo("New Zealand");
    }

    @Test
    public void selectingInAMultiValueDropdownWithASearchBox() {
        // TODO Enter 'Ca' and select California, then enter 'Ari' and select Arizona. Check that both appear as selected in the list

        List<String> selectedValues = null;

        assertThat(selectedValues).containsExactlyInAnyOrder("California","Arizona");
    }

}
