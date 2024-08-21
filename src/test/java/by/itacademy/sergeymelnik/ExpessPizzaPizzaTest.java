package by.itacademy.sergeymelnik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpessPizzaPizzaTest extends BaseTest {

    @Test
    public void testAddPizzaInCart(){

        ExpressPizzaPizzaPage expressPizzaPizzaPage = new ExpressPizzaPizzaPage();
        expressPizzaPizzaPage.openMainPage(driver);
        expressPizzaPizzaPage.goToPizzaFieldContent(driver);
        expressPizzaPizzaPage.chooseFood(driver, ExpressPizzaPizzaPage.PIZZA_MARGARITA_30_CM);
        expressPizzaPizzaPage.goToMiidleCart(driver);
        String actualOerder = expressPizzaPizzaPage.checkOnePizza(driver);
        String expectedOrder = "Маргарита30";
        Assertions.assertEquals(expectedOrder, actualOerder);


    }
}
