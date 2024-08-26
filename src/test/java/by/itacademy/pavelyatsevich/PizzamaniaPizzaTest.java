package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.page.PizzamaniaCartPizzaPage;
import by.itacademy.pavelyatsevich.page.PizzamaniaMainPizzaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PizzamaniaPizzaTest extends CommonCondition {

    @Test
    public void testAddMargaritaPizzaToCart(){
        boolean isMargaritaContained = new PizzamaniaMainPizzaPage(driver)
                .openPage()
                .clickPizzaInMenuBlock()
                .addPizzaMargaritaToCart()
                .clickCartButton()
                .getListProductsInCart()
                .contains(PizzamaniaCartPizzaPage.MARGARITA_CART_LIST_TEXT);

        Assertions.assertTrue(isMargaritaContained);
    }

    @Test
    public void testAddMargaritaPizzaAndPepsiColaToCart(){
        List<String> listProductsInCart = new PizzamaniaMainPizzaPage(driver)
                .openPage()
                .clickPizzaInMenuBlock()
                .addPizzaMargaritaToCart()
                .clickDesertsAndBeveragesButtonInMenuBlock()
                .addPepsiColaToCart()
                .clickCartButton()
                .getListProductsInCart();

        Assertions.assertTrue(listProductsInCart.contains(PizzamaniaCartPizzaPage.MARGARITA_CART_LIST_TEXT));
        Assertions.assertTrue(listProductsInCart.contains(PizzamaniaCartPizzaPage.PEPSI_COLA_CART_LIST_TEXT));
    }
}
