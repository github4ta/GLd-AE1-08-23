package by.itacademy.denisbaranov;

import org.openqa.selenium.By;

public class PizzaTempoPizzaPage extends BasePage {

    private final String menuButtonTempoPizzaXPath = "/html/body/div[1]/div[3]/ul/li[1]/a";
    private final By menuButtonTempoPizzaBy = By.xpath(menuButtonTempoPizzaXPath);

    public PizzaTempoPizzaPage() {
        super();
    }

    public void OpenPage() {
        final String BASE_URL = "https://www.pizzatempo.by/menu/pizza.html";
        driver.navigate().to(BASE_URL);
    }
}
