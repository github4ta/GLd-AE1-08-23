package by.itacademy.sergeymelnik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExpressPizzaPizzaPage extends BasePage {

     public ExpressPizzaPizzaPage() {
        super();
    }

    private final String FIELD_CONTENT_PIZZA_XPATH = "//a[@href='/picca']";
    private final String URL = "https://express-pizza.by/";
    public static final String PIZZA_MARGARITA_30_CM = "//button[@id='edit-submit-42523']";
    private static final String MIDDLE_CART = "//li[@class='cart-block-checkout']/a[@href='/cart/checkout']";
    private static final String ONE_IN_CAR = "//td[@class='desc']";

    public void openMainPage(WebDriver driver){
       driver.get(URL);
   }

    public void goToPizzaFieldContent(WebDriver driver){
        By fieldContentPizzaBy = By.xpath(FIELD_CONTENT_PIZZA_XPATH);
        WebElement fieldContentPizzaWebElement = driver.findElement(fieldContentPizzaBy);
        fieldContentPizzaWebElement.click();
    }

    public void chooseFood(WebDriver driver,String food){
        By foodBy = By.xpath(PIZZA_MARGARITA_30_CM);
        WebElement foodWebElement = driver.findElement(foodBy);
        foodWebElement.click();
    }

    public void goToMiidleCart(WebDriver driver){
        By middleCartBy = By.xpath(MIDDLE_CART);
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.presenceOfElementLocated(middleCartBy));
        WebElement middleCartWebElement = driver.findElement(middleCartBy);
        middleCartWebElement.click();
    }

    public String checkOnePizza(WebDriver driver){
        By onePizzaBy = By.xpath(ONE_IN_CAR);
        WebElement onePizzaWebElement = driver.findElement(onePizzaBy);
        return onePizzaWebElement.getText();
    }


}
