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
        pizzamarketPizzaPage.clickMenuButtonPizza();
        pizzamarketPizzaPage.scrollToProduct(pizzaName);
        pizzamarketPizzaPage.clickSelectButtonProduct(pizzaName);
        ConfirmAddressModalPage confirmAddressModalPage = new ConfirmAddressModalPage();
        confirmAddressModalPage.inputAddressStreet("Победителей");
        confirmAddressModalPage.inputAddressHouse(91);
        confirmAddressModalPage.clickButtonConfirm();
        PizzaAdditionalIngridientsModalPage pizzaAdditionalIngridientsModalPage = new PizzaAdditionalIngridientsModalPage();
        pizzaAdditionalIngridientsModalPage.clickButtonAddToCart();

        Assertions.assertTrue(pizzamarketPizzaPage.getProductNamesInCart().contains(pizzaName));
    }

    @Test
    public void testAddMargaritaPizzaAndColaToCart() {
        String pizzaName = "Маргарита";
        String drinkName = "Напиток газированный «Coca-Cola»";

        PizzamarketPizzaPage pizzamarketPizzaPage = new PizzamarketPizzaPage();
        pizzamarketPizzaPage.clickMenuButtonPizza();
        pizzamarketPizzaPage.scrollToProduct(pizzaName);
        pizzamarketPizzaPage.clickSelectButtonProduct(pizzaName);
        ConfirmAddressModalPage confirmAddressModalPage = new ConfirmAddressModalPage();
        confirmAddressModalPage.inputAddressStreet("Победителей");
        confirmAddressModalPage.inputAddressHouse(91);
        confirmAddressModalPage.clickButtonConfirm();
        PizzaAdditionalIngridientsModalPage pizzaAdditionalIngridientsModalPage = new PizzaAdditionalIngridientsModalPage();
        pizzaAdditionalIngridientsModalPage.clickButtonAddToCart();
        pizzamarketPizzaPage.clickMenuButtonDrink();
        pizzamarketPizzaPage.scrollToProduct(drinkName);
        pizzamarketPizzaPage.clickSelectButtonProduct(drinkName);
        DrinkSelectSizeModalPage drinkSelectSizeModalPage = new DrinkSelectSizeModalPage();
        drinkSelectSizeModalPage.clickButtonAddToCart();

        Assertions.assertTrue(pizzamarketPizzaPage.getProductNamesInCart().contains(pizzaName));
        Assertions.assertTrue(pizzamarketPizzaPage.getProductNamesInCart().contains(drinkName));
    }
}
