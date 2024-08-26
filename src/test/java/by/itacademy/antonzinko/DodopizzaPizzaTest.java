package by.itacademy.antonzinko;

import by.itacademy.antonzinko.pages.DodopizzaPizzaPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DodopizzaPizzaTest extends BaseTest {

    @BeforeEach
    public void beforeEachTest() {
        new DodopizzaPizzaPage().openPage();
    }

    @Test
    public void testAddMargaritaPizza() {
        String pizzaName = "Маргарита";
    }
}
