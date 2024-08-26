package by.itacademy.pavelyatsevich.page;

import by.itacademy.pavelyatsevich.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class PizzamainiaCartPizzaPage extends AbstractPage {

    private static final String CART_URL = "https://pizzamania.by/cart.php";
    private final String MARGARITA_CART_LIST_TEXT = "Маргарита*";
    private final String PEPSI_COLA_CART_LIST_TEXT = "Pepsi-cola";

    @FindAll( @FindBy(xpath = "//div[@class='row cart_item']"))
    private List<WebElement> cartList;

    public List<String> getListProductsInCart() {
        Waiters.waitFor(1);
        return cartList.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    @Override
    protected PizzamainiaCartPizzaPage openPage() {
        driver.navigate().to(CART_URL);
        return this;
    }

    protected PizzamainiaCartPizzaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
}
