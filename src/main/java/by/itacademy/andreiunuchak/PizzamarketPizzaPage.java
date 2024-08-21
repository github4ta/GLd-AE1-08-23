package by.itacademy.andreiunuchak;

import by.onliner.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

public class PizzamarketPizzaPage {
    private final WebDriver driver;

    public PizzamarketPizzaPage() {
        driver = DriverSingleton.getWebDriver();
    }

    private final String menuButtonPizzaXpath = "//a[@href='/pizza#main']";
    private final By menuButtonPizzaBy = By.xpath(menuButtonPizzaXpath);

    private final String menuButtonDrinkXpath = "//a[@href='/drink#main']";
    private final By menuButtonDrinkBy = By.xpath(menuButtonDrinkXpath);

    private final String itemProductNameXpath = "//div[@class='product-item']//h3";
    private final By itemProductNameBy = By.xpath(itemProductNameXpath);

    private final String itemProductSelectButtonXpath = "//div[@class='product-item']//button";
    private final By itemProductSelectButtonBy = By.xpath(itemProductSelectButtonXpath);

    private final String itemProductNameInCartXpath = "//div[@class='cart-item']//h3";
    private final By itemProductNameInCartNameBy = By.xpath(itemProductNameInCartXpath);

    public void openPage() {
        String BASE_URL = "https://pizzamarket.by/";
        driver.navigate().to(BASE_URL);
    }

    public void clickMenuButtonPizza() {
        Waiters.waitFor(1);
        driver.findElement(menuButtonPizzaBy).click();
    }

    public void clickMenuButtonDrink() {
        Waiters.waitFor(1);
        driver.findElement(menuButtonDrinkBy).click();
    }

    private WebElement findProductInList(String productName) {
        List<WebElement> listItemProductNameWebElements = driver.findElements(itemProductNameBy);
        List<WebElement> listItemProductSelectButtonWebElement = driver.findElements(itemProductSelectButtonBy);
        for (int i = 0; i < listItemProductNameWebElements.size(); i++) {
            String itemProductNameText = listItemProductNameWebElements.get(i).getText();
            if (itemProductNameText.equals(productName)) {
                return listItemProductSelectButtonWebElement.get(i);
            }
        }
        return null;
    }

    public void scrollToProduct(String productName) {
        Waiters.waitFor(1);
        new Actions(driver).moveToElement(findProductInList(productName)).perform();
    }

    public void clickSelectButtonProduct(String productName) {
        findProductInList(productName).click();
    }


    public List<String> getProductNamesInCart() {
        Waiters.waitFor(1);
        List<WebElement> listProductNamesInCartWebElements = driver.findElements(itemProductNameInCartNameBy);
        List<String> listProductNamesInCartText = listProductNamesInCartWebElements.stream().map(WebElement::getText).collect(Collectors.toList());
        return listProductNamesInCartText;
    }
}
