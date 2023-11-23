package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        //the locator is not unique, needs to be researched

        //driver.findElement(By.id("select2-country-container")).click();
       // driver.findElement(By.cssSelector("span.select2-selection.select2-selection--single")).click();
        driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Ne");
        driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(.,'New Zealand')]")).click();

//        String selectedCountry = driver.findElement(By.id("select2-country-container")).getText();
//        assertThat(selectedCountry).isEqualTo("New Zealand");
    }

    @Test
    public void selectingInAMultiValueDropdownWithASearchBox() {
        // DONE Enter 'Ca' and select California, then enter 'Ari' and select Arizona. Check that both appear as selected in the list
        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Ca");
        driver.findElement(By.xpath("//li[.='California']")).click();

        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Ari");
        driver.findElement(By.xpath("//li[.='Arizona']")).click();

        List<String> selectedValues = driver.findElements(By.cssSelector(".select2-selection__choice"))
                .stream().map(value -> value.getAttribute("title")).collect(Collectors.toList());

        assertThat(selectedValues).containsExactlyInAnyOrder("California","Arizona");
    }

}
