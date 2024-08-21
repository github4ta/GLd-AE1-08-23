package by.itacademy.irinanovik;

import org.openqa.selenium.By;

public class TempoPizzaPage extends BasePage {

    public TempoPizzaPage() {
        super();
    }

    private final String menuButtonPizzaXpath = "/html/body/div[1]/div[3]/ul/li[1]/a";
    private final By menuButtonPizzaBy = By.xpath(menuButtonPizzaXpath);

    public void openPage() {
        String BASE_URL = "https://www.pizzatempo.by/menu/pizza.html";
        driver.navigate().to(BASE_URL);
    }


}
