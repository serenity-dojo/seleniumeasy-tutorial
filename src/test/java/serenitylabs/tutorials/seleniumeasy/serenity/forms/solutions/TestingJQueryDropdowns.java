package serenitylabs.tutorials.seleniumeasy.serenity.forms.solutions;

import org.junit.Before;
import org.junit.Test;
import serenitylabs.tutorials.seleniumeasy.serenity.WithSerenity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestingJQueryDropdowns extends WithSerenity {

    @Before
    public void openPage() {
        openDemoPage("jquery-dropdown-search-demo.html");
    }

    @Test
    public void selectingInADropdownWithASearchBox() {
        // TODO: Click on the dropdown and enter 'Ne', then select 'New Zealand' in the dropdown

        $(".select2-selection--single").click();

        $("//li[@class='select2-results__option'][.='New Zealand']").click();

        String selectedCountry = $("#country").getFirstSelectedOptionVisibleText();

        assertThat(selectedCountry).isEqualTo("New Zealand");
    }

    @Test
    public void selectingInAMultiValueDropdownWithASearchBox() {
        // TODO: Click on the dropdown and enter 'Ca', then choose Califorina. Do the same for Ari/Arizona.
        // Then check that these states have been selected.

        $(".select2-selection--multiple").click();

        $(".select2-search__field").sendKeys("Ca");
        $("//li[.='California']").click();

        $(".select2-search__field").sendKeys("Ari");
        $("//li[.='Arizona']").click();

        List<String> selectedValues = $$(".select2-selection__choice").map(element -> element.getAttribute("title"));

        assertThat(selectedValues).containsExactlyInAnyOrder("California","Arizona");
    }

}
