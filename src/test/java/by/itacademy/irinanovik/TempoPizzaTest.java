package by.itacademy.irinanovik;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TempoPizzaTest extends BaseTest {

    @BeforeEach
    public void beforeEachTest() {
        new TempoPizzaPage().openPage();
    }

    @Test
    public void testAddMargaritaPizzaToCart() {
        String pizzaName = "Маргарита";

    }
}
