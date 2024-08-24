package by.itacademy.aksanabazhenava;

import by.onliner.Waiters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DominosPizzaTest {

    private WebDriver driver;
    private final String PIZZA_URL = "https://www.dominos.by/";

    @BeforeEach
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PIZZA_URL);
    }

    @Test
    public void testPizza4SeasonsAndCocaColaInBin() {
        By linkOpenPizzaBy = By.xpath(DominosPizzaPage.LINK_PIZZA);
        WebElement linkOpenPizzaWebElement = driver.findElement(linkOpenPizzaBy);
        linkOpenPizzaWebElement.click();
        Waiters.waitFor(2);

        By buttonAddToBinPizza4SeasonsBy = By.xpath(DominosPizzaPage.BUTTON_ADD_TOBIN_PIZZA_4SEASONS);
        WebElement buttonAddToBinPizza4SeasonsWebElement = driver.findElement(buttonAddToBinPizza4SeasonsBy);
        buttonAddToBinPizza4SeasonsWebElement.click();
        Waiters.waitFor(2);

        By linkOpenDrinksBy = By.xpath(DominosPizzaPage.DOMINOS_DRINKS);
        WebElement linkOpenDrinksWebElement = driver.findElement(linkOpenDrinksBy);
        linkOpenDrinksWebElement.click();
        Waiters.waitFor(2);

        By buttonAddToBinCocaColaBy = By.xpath(DominosPizzaPage.BUTTON_ADD_TOBIN_COCA_COLA);
        WebElement buttonAddToBin4SeasonsWebElement = driver.findElement(buttonAddToBinCocaColaBy);
        buttonAddToBin4SeasonsWebElement.click();
        Waiters.waitFor(2);

        By buttonOrderBy = By.xpath(DominosPizzaPage.BUTTON_ORDER);
        WebElement buttonOrderWebElement = driver.findElement(buttonOrderBy);
        buttonOrderWebElement.click();
        Waiters.waitFor(2);

        By pizza4SeasonsInBinBy = By.xpath(DominosPizzaPage.PIZZA_NAME_IN_BIN_TO_ORDER);
        WebElement pizza4SeasonsInBinWebElement = driver.findElement(pizza4SeasonsInBinBy);
        pizza4SeasonsInBinWebElement.click();
        Waiters.waitFor(2);

        String actualPizzaNameText = pizza4SeasonsInBinWebElement.getText();
        String expectedPizzaNameText = "4 сезона";

        Assertions.assertEquals(expectedPizzaNameText, actualPizzaNameText);

        By cocaColaInBinBy = By.xpath(DominosPizzaPage.COCA_COLA_IN_BIN_TO_ORDER);
        WebElement cocaColaInBinWebElement = driver.findElement(cocaColaInBinBy);
        cocaColaInBinWebElement.click();
        Waiters.waitFor(2);

        String actualCocaColaNameText = cocaColaInBinWebElement.getText();
        String expectedCocaColaNameText = "Кока-Кола";

        Assertions.assertEquals(expectedCocaColaNameText, actualCocaColaNameText);
    }

    @AfterEach
    public void driverQuit() {
        driver.quit();
    }
}
