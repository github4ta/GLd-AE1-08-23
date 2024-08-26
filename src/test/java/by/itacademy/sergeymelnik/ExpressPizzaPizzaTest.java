package by.itacademy.sergeymelnik;

import by.itacademy.sergeymelnik.util.Waiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpressPizzaPizzaTest extends BaseTest {

    @Test
    public void testAddPizzaInCart(){
        ExpressPizzaPizzaPage expressPizzaPizzaPage = new ExpressPizzaPizzaPage();  // создаем экземпляр класса для досупака к Page Objects
        expressPizzaPizzaPage.openMainPage(driver); // загружаем сайт
        expressPizzaPizzaPage.goToPizzaFieldContent(driver);   // переходим на нажную вкладку
        expressPizzaPizzaPage.chooseFood(driver, ExpressPizzaPizzaPage.PIZZA_MARGARITA_30_CM);   // делаем заказ пиццы
        Waiter.wait(2);                    // делаем паузу 2секунды, чтобы дать загрузиться коду, так как не всегда проходит тест
        expressPizzaPizzaPage.goToMiidleCart(driver);  // идем в корзину
        String actualOerder = expressPizzaPizzaPage.checkOnePizza(driver);   // проверяем реальный результат
        String expectedOrder = "Маргарита30";              // ожидаемый результат
        Assertions.assertEquals(expectedOrder, actualOerder);   //  проверка
    }
}
