package by.itacademy.andreiunuchak;

import by.onliner.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class PizzamarketPizzaPage {
    private final WebDriver driver;

    public PizzamarketPizzaPage() {
        driver = DriverSingleton.getWebDriver();
    }

    private final String menuButtonPizzaXpath = "//a[@href='/pizza#main']";
    private final By menuButtonPizzaBy = By.xpath(menuButtonPizzaXpath);

    private final String itemPizzaNameXpath = "//div[@class='product-item']//h3";
    private final By itemPizzaNameBy = By.xpath(itemPizzaNameXpath);

    private final String itemPizzaSelectButtonXpath = "//div[@class='product-item']//button";
    private final By itemPizzaSelectButtonBy = By.xpath(itemPizzaSelectButtonXpath);

    private final String itemCartNameXpath = "//div[@class='cart-item']//h3";
    private final By itemCartNameBy = By.xpath(itemCartNameXpath);

    public void openPage() {
        String BASE_URL = "https://pizzamarket.by/";
        driver.navigate().to(BASE_URL);
    }

    public void clickMenuButtonPizza() {
        Waiters.waitFor(1);
        driver.findElement(menuButtonPizzaBy).click();
    }

    private WebElement findPizzaInList(String pizzaName) {
        List<WebElement> listItemPizzaNameWebElements = driver.findElements(itemPizzaNameBy);
        List<WebElement> listItemPizzaSelectButtonWebElement = driver.findElements(itemPizzaSelectButtonBy);
        for (int i = 0; i < listItemPizzaNameWebElements.size(); i++) {
            String itemPizzaNameText = listItemPizzaNameWebElements.get(i).getText();
            if (itemPizzaNameText.equals(pizzaName)) {
                return listItemPizzaSelectButtonWebElement.get(i);
            }
        }
        return null;
    }

    public void scrollTo(String pizzaName) {
        Waiters.waitFor(1);
        new Actions(driver).moveToElement(findPizzaInList(pizzaName)).perform();
    }

    public void clickSelectButtonPizza(String pizzaName) {
        findPizzaInList(pizzaName).click();
    }


    public List<String> getAddedToCartItemNames() {
        Waiters.waitFor(1);
        List<WebElement> listCartItemNamesWebElements = driver.findElements(itemCartNameBy);
        List<String> listAddedToCartItemNames = new ArrayList<>();
        for (WebElement cartItemWebElement : listCartItemNamesWebElements) {
            String name = cartItemWebElement.findElement(itemCartNameBy).getText();
            listAddedToCartItemNames.add(name);
        }
        return listAddedToCartItemNames;
    }
}
