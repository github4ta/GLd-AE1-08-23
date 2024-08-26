package by.itacademy.pavelyatsevich.page;

import by.itacademy.pavelyatsevich.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzamaniaMainPizzaPage extends AbstractPage {

    private static final String BASE_URL = "https://pizzamania.by/";
    private static final String PIZZA_BUTTON_MENU_BLOCK_XPATH = "//a[@href='/#pizza']";
    private static final String PIZZA_MARGARITA_CART_BUTTON_XPATH = "//a[@data-id='37']";
    private static final String DESERTS_AND_BEVERAGES_BUTTON_MENU_BLOCK_XPATH = "//a[@href='/#desserts']";
    private static final String PEPSI_COLA_CART_BUTTON_XPATH = "//a[@data-id='91']";
    private static final String CART_BUTTON_XPATH = "//a[@id='basket']";

    @FindBy(xpath = PIZZA_BUTTON_MENU_BLOCK_XPATH)
    private WebElement pizzaButtonMenuBlock;

    @FindBy(xpath = PIZZA_MARGARITA_CART_BUTTON_XPATH)
    private WebElement pizzaMargaritaCartButton;

    @FindBy(xpath = DESERTS_AND_BEVERAGES_BUTTON_MENU_BLOCK_XPATH)
    private WebElement desertsAndBeveragesButtonMenuBlock;

    @FindBy(xpath = PEPSI_COLA_CART_BUTTON_XPATH)
    private  WebElement pepsiColaCartButton;

    @FindBy(xpath = CART_BUTTON_XPATH)
    private WebElement cartButton;

    public PizzamaniaMainPizzaPage clickPizzaInMenuBlock() {
        Waiters.waitFor(2);
        pizzaButtonMenuBlock.click();
        return this;
    }

    public PizzamaniaMainPizzaPage addPizzaMargaritaToCart() {
        Waiters.waitFor(3);
        pizzaMargaritaCartButton.click();
        return this;
    }

    public PizzamaniaMainPizzaPage addPepsiColaToCart() {
        Waiters.waitFor(3);
        pepsiColaCartButton.click();
        return this;
    }

    public PizzamaniaMainPizzaPage clickDesertsAndBeveragesButtonInMenuBlock() {
        Waiters.waitFor(2);
        desertsAndBeveragesButtonMenuBlock.click();
        return this;
    }

    public PizzamaniaCartPizzaPage clickCartButton() {
        Waiters.waitFor(2);
        cartButton.click();
        return new PizzamaniaCartPizzaPage(driver);
    }

    @Override
    public PizzamaniaMainPizzaPage openPage() {
        driver.navigate().to(BASE_URL);
        return this;
    }

    public PizzamaniaMainPizzaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
}
