package by.itacademy.olgazaitseva;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.pomidorsinior.SoupTest;

public class TerraPizzaTest {
    public WebDriver driver;
    public TerraPizzaPage terraPizzaPage;
    public final String BASE_URL = "https://terrapizza.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        terraPizzaPage = new TerraPizzaPage(driver);
    }

    @Test
    public void testTerraPizza() {
        terraPizzaPage.clickHomePageCookiesCloseButton();
        terraPizzaPage.clickHomePageMenuLink();
        terraPizzaPage.clickMenuPagePizzaLink();
        terraPizzaPage.clickPizzaPageMargaritaBasketButton();
        terraPizzaPage.clickHomePageMenuLink();
        terraPizzaPage.clickMenuPageBarLink();
        terraPizzaPage.clickBarPageBumbleBasketButton();

        terraPizzaPage.clickPageBasketButton();
        terraPizzaPage.findBasketPopUpProduktOneName();
        terraPizzaPage.setExpectedProduktName("Пицца Маргарита на тонком 32 см");
        Assertions.assertEquals(terraPizzaPage.expectedProduktName, terraPizzaPage.actualProduktName);
        terraPizzaPage.findBasketPopUpProduktTwoName();
        terraPizzaPage.setExpectedProduktName("Бамбл");
        Assertions.assertEquals(terraPizzaPage.expectedProduktName, terraPizzaPage.actualProduktName);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
