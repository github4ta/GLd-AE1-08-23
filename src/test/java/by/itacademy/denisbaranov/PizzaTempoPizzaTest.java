package by.itacademy.denisbaranov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PizzaTempoPizzaTest extends BaseTest {

    @BeforeEach
    public void beforeEachTest() {
        new PizzaTempoPizzaPage().openPage();
    }

    @Test
    public void testAddFourSeasonsToCard() {
        String pizzaName = "4 Сезона";
    }

}
