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
        String expectedErrorMessage = "�� ������� ���.\n" +
                "���� ������ ���� � ��������� 50-300 ��.\n" +
                "��� ������ ���� � ��������� 3-500 ��.\n" +
                "�� ������ ���.";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
