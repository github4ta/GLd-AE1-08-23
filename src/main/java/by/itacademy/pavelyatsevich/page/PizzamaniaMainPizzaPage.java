package by.itacademy.pavelyatsevich.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzamaniaMainPizzaPage extends AbstractPage {

    private static final String BASE_URL = "https://pizzamania.by/";

    @FindBy(xpath = "//a[@href='/#pizza']")
    private WebElement pizzaButtonMenuBlock;

    @FindBy(xpath = "//article[@id='item-37']")
    private WebElement pizzaMargarita;

    @FindBy(xpath = "//a[@href='/#desserts']")
    private WebElement desertsAndBeveragesButtonMenuBlock;

    @FindBy(xpath = "//article[@id='item-91']")
    private  WebElement pepsiCola;

    @FindBy(xpath = "//a[@id='basket']")
    private WebElement cartButton;

    public void clickPizzaInMenuBlock() {
        pizzaButtonMenuBlock.click();
    }

    public void clickDesertsAndBeveragesButtonInMenuBlock() {
        desertsAndBeveragesButtonMenuBlock.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    @Override
    protected PizzamaniaMainPizzaPage openPage() {
        driver.navigate().to(BASE_URL);
        return this;
    }

    protected PizzamaniaMainPizzaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
}
