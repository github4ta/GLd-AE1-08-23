package by.itacademy.dmitriymedvedev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    public static final String BUTTON_PIZZA = "//span[@id='nav_pizza' and contains(@class, 'CategoryIcons__link_pizza')]";
    public final String ADD_MARGARITA_PIZZA = "//img[@alt='Пицца Маргарита']";
    public final String CLICK_ADD_TO_CART = "//button[@type ='button'][@class = 'PdZogalGcZKBiADOHltbG ProductCardModal__button']";
    public final String TITLE_IN_CART = "//div[text()='Маргарита']";
    public static final String IMAGE_TITLE = "//span[text()='Маргарита']";

    WebDriver driver;

    By addMargaritaPizzaBy = By.xpath(ADD_MARGARITA_PIZZA);
    By addToCartBy = By.xpath(CLICK_ADD_TO_CART);
    By titleCartBy = By.xpath(TITLE_IN_CART);

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addMargaritaPizzaToCart() {
        WebElement addMargaritaPizzaWebElement = driver.findElement(addMargaritaPizzaBy);
        addMargaritaPizzaWebElement.click();
    }

    public void addToCart() {
        WebElement addToCartWebElement = driver.findElement(addToCartBy);
        addToCartWebElement.click();
    }

    public String getTitleInCart() {
        WebElement titleCartWebElement = driver.findElement(titleCartBy);
        return titleCartWebElement.getText();
    }
}


