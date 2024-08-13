package by.itacademy.antonzinko.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebSiteTest extends BaseTest {
    @Test
    public void test() {
        String linkBackgroundXPath = "//input[@type='submit']";
        By linkBackgroundBy = By.xpath(linkBackgroundXPath);
        WebElement linkBackgroundWebElement = driver.findElement(linkBackgroundBy);

        linkBackgroundWebElement.click();

        String titleSmartphoneXPath = "//h1[@class='catalog-masthead__title js-nav-header']";
        By titleSmartphoneBy = By.xpath(titleSmartphoneXPath);
        WebElement titleSmartphoneWebElement = driver.findElement(titleSmartphoneBy);

        String actualErrorMessage = titleSmartphoneWebElement.getText();
        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
