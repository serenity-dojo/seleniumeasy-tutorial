package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class TestingJQueryDropdowns extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("jquery-dropdown-search-demo.html");
    }

    @Test
    public void selectingInADropdownWithASearchBox() throws InterruptedException {
        // TODO: Click on the dropdown and enter 'Ne', then select 'New Zealand' in the dropdown

        driver.findElement(By.className("select2-selection__arrow")).click();

        WebElement dropDown = driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']"));
        WebElement selected = driver.findElement(By.xpath("//*[@id='select2-country-results']//li[text()='New Zealand']"));
        dropDown.sendKeys("Ne");
        dropDown.sendKeys(Keys.ARROW_DOWN);
        dropDown.sendKeys(Keys.ENTER);
        //selected.sendKeys(Keys.ENTER);

        String selectedCountry = new Select(driver.findElement(By.id("country"))).getFirstSelectedOption().getText();

        assertThat(selectedCountry).isEqualTo("New Zealand");
    }

    @Test
    public void selectingInAMultiValueDropdownWithASearchBox () throws InterruptedException {
        // TODO Enter 'Ca' and select California, then enter 'Ari' and select Arizona. Check that both appear as selected in the list

        WebElement field = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        field.sendKeys("Ca");
        driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
        //field.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        field.sendKeys("Ari");
        driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
        //field.sendKeys(Keys.ENTER);

        Select select = new Select(driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']")));


        List<String> selectedValues = select.getAllSelectedOptions()
                .stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());


        assertThat(selectedValues).containsExactlyInAnyOrder("California","Arizona");
    }

}
