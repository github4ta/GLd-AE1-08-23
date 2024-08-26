package by.itacademy.pavelyatsevich.page;

import by.itacademy.pavelyatsevich.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzamaniaMainPizzaPage extends AbstractPage {

    private static final String BASE_URL = "https://pizzamania.by/";

    @FindBy(xpath = "//a[@href='/#pizza']")
    private WebElement pizzaButtonMenuBlock;

    @FindBy(xpath = "//a[@data-id='37']")
    private WebElement pizzaMargarita;

    @FindBy(xpath = "//a[@href='/#desserts']")
    private WebElement desertsAndBeveragesButtonMenuBlock;

    @FindBy(xpath = "//a[@data-id='91']")
    private  WebElement pepsiCola;

    @FindBy(xpath = "//a[@id='basket']")
    private WebElement cartButton;

    public PizzamaniaMainPizzaPage clickPizzaInMenuBlock() {
        Waiters.waitFor(2);
        pizzaButtonMenuBlock.click();
        return this;
    }

    public PizzamaniaMainPizzaPage addPizzaMargaritaToCart() {
        Waiters.waitFor(3);
        pizzaMargarita.click();
        return this;
    }

    public PizzamaniaMainPizzaPage addPepsiColaToCart() {
        Waiters.waitFor(3);
        pepsiCola.click();
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
