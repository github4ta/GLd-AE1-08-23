package by.itacademy.denisbaranov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PizzaTempoPizzaTest extends BaseTest {

    @BeforeEach
    public void beforeEachTest() {
        new PizzaTempoPizzaPage().OpenPage();
    }

    @Test
    public void testAddFourSeasonsToCard() {

        String pizzaNameXPath = "//*[@id=\"63\"]/h3/span";
        By fieldPizzaNameTextBy = By.xpath(pizzaNameXPath);
        WebElement fieldPizzaNameTextWebElement = driver.findElement(fieldPizzaNameTextBy);
        String actualTextMessage = fieldPizzaNameTextWebElement.getText();
        String expectedTextMessage = "Пицца \"4 сезона\" ";

        Assertions.assertEquals(expectedTextMessage, actualTextMessage);
    }

}
