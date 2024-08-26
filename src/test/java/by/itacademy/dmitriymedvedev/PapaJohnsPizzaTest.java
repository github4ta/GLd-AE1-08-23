package by.itacademy.dmitriymedvedev;

import org.junit.jupiter.api.*;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PapaJohnsPizzaTest extends BasePapaJohnsTest {
    @BeforeEach
    public void closePopup() throws InterruptedException {
        By buttonCloseBy = By.xpath(CityChooseModalPage.BUTTON_CLOSE_XPATH);
        WebElement buttonCloseWebElement = driver.findElement(buttonCloseBy);
        Thread.sleep(5000);
        buttonCloseWebElement.click();
    }

    @Test
    public void openMenuPizza() throws InterruptedException {
        By menuButtonPizzaBy = By.xpath(MenuPage.BUTTON_PIZZA);
        WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
        menuButtonPizzaWebElement.click();

        WebElement image = driver.findElement(By.xpath(MenuPage.IMAGE_TITLE));
        new Actions(driver)
                .scrollToElement(image)
                .perform();

        MenuPage menuPage;
        menuPage = new MenuPage(driver);
        menuPage.addMargaritaPizzaToCart();
        menuPage.addToCart();

        String actualTitlePizzaText = menuPage.getTitleInCart();
        String expectedTitlePizzaText = "Маргарита";
        Assertions.assertEquals(expectedTitlePizzaText, actualTitlePizzaText);
    }
}
