package by.itacademy.antonzinko.pages;

import org.openqa.selenium.By;

public class DodopizzaPizzaPage extends BasePage {
    public DodopizzaPizzaPage() {
        super();
    }

    private final String MENU_BUTTON_PIZZA_XPATH = "//*[@id=\"rdgoc\"]/article[31]/main/div/a";
    private final By menuButtonPizzaBy = By.xpath(MENU_BUTTON_PIZZA_XPATH);

    public void openPage() {
        final String BASE_URL = "https://dodopizza.by/minsk";
        driver.navigate().to(BASE_URL);
    }
}
