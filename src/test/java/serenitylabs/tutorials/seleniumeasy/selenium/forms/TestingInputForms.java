package serenitylabs.tutorials.seleniumeasy.selenium.forms;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import serenitylabs.tutorials.seleniumeasy.selenium.WithWebdriverSupport;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class TestingInputForms extends WithWebdriverSupport {

    @Before
    public void openPage() {
        open("basic-first-form-demo.html");
    }

    @Test
    public void enteringASingleInputForm() {
        // TODO: Enter a message in the Single Input Field and check that it is shown
        driver.findElement(By.xpath("//*[text()='No, thanks!']")).click();
        WebElement inputField =  driver.findElement(By.id("user-message"));
        inputField.sendKeys("Hello world");

        String displayedText = inputField.getText() ; // TODO: Fix me

        assertThat(displayedText.equals("Hello World"));
    }

    @Test
    public void enterTwoValues() {
        // TODO: Enter a number in each input field and verify the calculated total
        WebElement value1 = driver.findElement(By.id("sum1"));
        WebElement value2 = driver.findElement(By.id("sum2"));
        WebElement total = driver.findElement(By.xpath("//button[text() = 'Get Total']"));

        value1.sendKeys("1");
        value1.sendKeys("2");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", total);

        //total.click();

        String displayedValue = driver.findElement(By.id("displayvalue")).getText(); // TODO: Fix me

        assertThat(displayedValue.equals("3"));
    }
}
