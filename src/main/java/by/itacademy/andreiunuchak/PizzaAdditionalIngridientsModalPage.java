package by.itacademy.andreiunuchak;

import by.onliner.Waiters;
import org.openqa.selenium.By;

public class PizzaAdditionalIngridientsModalPage extends BasePage {

    public PizzaAdditionalIngridientsModalPage() {
        super();
    }

    private final String buttonAddToCartXpath = "//div[@role='dialog']//button[@class='button']";
    private final By buttonAddToCartBy = By.xpath(buttonAddToCartXpath);

    public void clickButtonAddToCart() {
        Waiters.waitFor(1);
        driver.findElement(buttonAddToCartBy).click();
    }
}
