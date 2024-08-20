package by.itacademy.andreiunuchak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzamarketPizzaTest extends BaseTest {

    @BeforeEach
    public void beforeEachTest() {
        new PizzamarketPizzaPage().openPage();
    }

    @Test
    public void testAddMargaritaPizzaToCart() {
        String pizzaName = "Маргарита";

        PizzamarketPizzaPage pizzamarketPizzaPage = new PizzamarketPizzaPage();
        ConfirmAddressModalPage confirmAddressModalPage = new ConfirmAddressModalPage();
        AdditionalIngridientsModalPage additionalIngridientsModalPage = new AdditionalIngridientsModalPage();

        pizzamarketPizzaPage.clickMenuButtonPizza();
        pizzamarketPizzaPage.scrollTo(pizzaName);
        pizzamarketPizzaPage.clickSelectButtonPizza(pizzaName);
        confirmAddressModalPage.inputAddressStreet("Победителей");
        confirmAddressModalPage.inputAddressHouse(91);
        confirmAddressModalPage.clickButtonConfirm();
        additionalIngridientsModalPage.clickButtonAddToCart();

        Assertions.assertTrue(pizzamarketPizzaPage.getAddedToCartItemNames().contains(pizzaName));
    }
}
