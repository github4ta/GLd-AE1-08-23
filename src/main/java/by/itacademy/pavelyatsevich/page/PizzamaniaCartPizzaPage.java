package by.itacademy.pavelyatsevich.page;

import by.itacademy.pavelyatsevich.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class PizzamaniaCartPizzaPage extends AbstractPage {

    private static final String CART_URL = "https://pizzamania.by/cart.php";
    public static final String MARGARITA_CART_LIST_TEXT = "Маргарита*";
    public static final String PEPSI_COLA_CART_LIST_TEXT = "Pepsi-cola";

    @FindAll(@FindBy(xpath = "//div[@class='col-8 col-sm-5 order-2 product_text-container " +
            "d-flex align-items-center']/div/h5"))
    private List<WebElement> cartList;

    public List<String> getListProductsInCart() {
        Waiters.waitFor(2);
        return cartList.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    @Override
    public PizzamaniaCartPizzaPage openPage() {
        driver.navigate().to(CART_URL);
        return this;
    }

    public PizzamaniaCartPizzaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
}
