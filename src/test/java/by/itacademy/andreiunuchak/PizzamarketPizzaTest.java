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
        PizzaAdditionalIngridientsModalPage pizzaAdditionalIngridientsModalPage = new PizzaAdditionalIngridientsModalPage();

        pizzamarketPizzaPage.clickMenuButtonPizza();
        pizzamarketPizzaPage.scrollToProduct(pizzaName);
        pizzamarketPizzaPage.clickSelectButtonProduct(pizzaName);
        confirmAddressModalPage.inputAddressStreet("Победителей");
        confirmAddressModalPage.inputAddressHouse(91);
        confirmAddressModalPage.clickButtonConfirm();
        pizzaAdditionalIngridientsModalPage.clickButtonAddToCart();

        Assertions.assertTrue(pizzamarketPizzaPage.getProductNamesInCart().contains(pizzaName));
    }

    @Test
    public void testAddMargaritaPizzaAndColaToCart() {
        String pizzaName = "Маргарита";
        String drinkName = "Напиток газированный «Coca-Cola»";

        PizzamarketPizzaPage pizzamarketPizzaPage = new PizzamarketPizzaPage();
        ConfirmAddressModalPage confirmAddressModalPage = new ConfirmAddressModalPage();
        PizzaAdditionalIngridientsModalPage pizzaAdditionalIngridientsModalPage = new PizzaAdditionalIngridientsModalPage();
        DrinkSelectSizeModalPage drinkSelectSizeModalPage = new DrinkSelectSizeModalPage();

        pizzamarketPizzaPage.clickMenuButtonPizza();
        pizzamarketPizzaPage.scrollToProduct(pizzaName);
        pizzamarketPizzaPage.clickSelectButtonProduct(pizzaName);
        confirmAddressModalPage.inputAddressStreet("Победителей");
        confirmAddressModalPage.inputAddressHouse(91);
        confirmAddressModalPage.clickButtonConfirm();
        pizzaAdditionalIngridientsModalPage.clickButtonAddToCart();
        pizzamarketPizzaPage.clickMenuButtonDrink();
        pizzamarketPizzaPage.scrollToProduct(drinkName);
        pizzamarketPizzaPage.clickSelectButtonProduct(drinkName);
        drinkSelectSizeModalPage.clickButtonAddToCart();

        Assertions.assertTrue(pizzamarketPizzaPage.getProductNamesInCart().contains(pizzaName));
        Assertions.assertTrue(pizzamarketPizzaPage.getProductNamesInCart().contains(drinkName));
    }
}
