package serenitylabs.tutorials.seleniumeasy.selenium.forms.solutions;

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
        // TODO: Click on the dropdown and enter 'Ne', then select 'New Zealand' in the dropdown

        driver.findElement(By.cssSelector(".select2-selection--single")).click();

        driver.findElement(By.xpath("//li[@class='select2-results__option'][.='New Zealand']")).click();

        String selectedCountry = new Select(driver.findElement(By.id("country"))).getFirstSelectedOption().getText();

        assertThat(selectedCountry).isEqualTo("New Zealand");
    }

    @Test
    public void selectingInAMultiValueDropdownWithASearchBox() {
        // TODO: Click on the dropdown and enter 'Ne', then select 'New Zealand' in the dropdown

        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();

        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Ca");
        driver.findElement(By.xpath("//li[.='California']")).click();

        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Ari");
        driver.findElement(By.xpath("//li[.='Arizona']")).click();

        List<String> selectedValues = driver.findElements(By.cssSelector(".select2-selection__choice"))
                .stream()
                .map(element -> element.getAttribute("title")).collect(Collectors.toList());

        assertThat(selectedValues).containsExactlyInAnyOrder("California","Arizona");
    }

}
