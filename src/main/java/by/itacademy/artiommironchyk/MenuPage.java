package by.itacademy.artiommironchyk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    // Локаторы для элементов
    private final By pizzasLink = By.xpath("//a[contains(@class, 'navigation-goods__item') and text()='пиццы']");
    private final By fourSeasonsPizzaAddToCartButton = By.xpath("//div[@id='mainDiv']//li[contains(., 'Четыре сезона')]//button[contains(@class, 'in-cart')]");
    private final By pickupTab = By.xpath("//a[@href='#pickup']");
    private final By gazetapravdaButton = By.xpath("//button[@id='bypickup-2' and contains(text(), 'Газеты Правда просп., 20')]");
    private final By cartButton = By.xpath("//a[@data-forward='cart']"); // Локатор для корзины

    public MenuPage(WebDriver driver) {
        this.driver = driver;
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    // Метод для клика на ссылку "пиццы"
    public void clickOnPizzas() {
        WebElement element = driver.findElement(pizzasLink);
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // Метод для прокрутки страницы и клика на кнопку "В корзину" для пиццы "Четыре сезона"
    public void scrollToAndAddFourSeasonsToCart() {
        WebElement element = driver.findElement(fourSeasonsPizzaAddToCartButton);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        // Проверка видимости элемента и клик
        if (element.isDisplayed()) {
            jsExecutor.executeScript("arguments[0].click();", element);
        } else {
            throw new RuntimeException("Element is not clickable or not visible");
        }
    }

    // Метод для клика на "Самовывоз"
    public void clickOnPickup() {
        WebElement pickupElement = driver.findElement(pickupTab);
        jsExecutor.executeScript("arguments[0].click();", pickupElement);
    }

    // Метод для клика на кнопку "Газеты Правда просп., 20"
    public void clickOnGazetaPravda() {
        WebElement gazetaPravdaElement = driver.findElement(gazetapravdaButton);
        jsExecutor.executeScript("arguments[0].click();", gazetaPravdaElement);
    }

    // Метод для клика на корзину
    public void clickOnCart() {
        WebElement cartElement = driver.findElement(cartButton);
        jsExecutor.executeScript("arguments[0].click();", cartElement);
    }
}
