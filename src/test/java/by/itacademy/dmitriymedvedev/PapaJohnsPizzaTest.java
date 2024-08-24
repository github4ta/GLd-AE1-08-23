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
        //Thread.sleep(5000);


        WebElement image = driver.findElement(By.xpath("//span[text()='Маргарита']"));
        new Actions(driver)
                .scrollToElement(image)
                .perform();


        By addMargaritaPizzaBy = By.xpath(MenuPage.ADD_MARGARITA_PIZZA);
        WebElement addMargaritaPizzWebElement = driver.findElement(addMargaritaPizzaBy);
        addMargaritaPizzWebElement.click();

        By addToCartBy = By.xpath(MenuPage.CLICK_ADD_TO_CART);
        WebElement addToCartByPizzWebElement = driver.findElement(addToCartBy);
        addToCartByPizzWebElement.click();


        By titleCartBy = By.xpath(MenuPage.TITLE_IN_CART);
        WebElement titleCartWebElement = driver.findElement(titleCartBy);

        String actualTitlePizzaText = titleCartWebElement.getText();
        String expectedTitlePizzaText = "Маргарита";
        Assertions.assertEquals(expectedTitlePizzaText, actualTitlePizzaText);
        Thread.sleep(10000);
    }
}
