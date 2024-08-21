package by.itacademy.andreiunuchak;

import by.onliner.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DrinkSelectSizeModalPage {
    private final WebDriver driver;

    public DrinkSelectSizeModalPage() {
        driver = DriverSingleton.getWebDriver();
    }

    private final String buttonAddToCartXpath = "//div[@role='dialog']//div[@class='product-modal__text']//button";
    private final By buttonAddToCartBy = By.xpath(buttonAddToCartXpath);

    public void clickButtonAddToCart() {
        Waiters.waitFor(1);
        driver.findElement(buttonAddToCartBy).click();
    }
}
