package biz.svyatoslav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebSiteTest extends BaseTest {

    @Test
    public void testCalculatorWhenAllFieldsAreEmptyThenErrorMessage() {
        String buttonCalculateXpath = "//input[@type='submit']";
        String errorMessageXpath = "//b";

        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        By errorMessageBy = By.xpath(errorMessageXpath);

        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

        buttonCalculateWebElement.click();

        WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
