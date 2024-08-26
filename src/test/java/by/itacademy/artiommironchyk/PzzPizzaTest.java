package by.itacademy.artiommironchyk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PzzPizzaTest {

    private WebDriver driver;
    private MenuPage menuPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pzz.by");
        menuPage = new MenuPage(driver);
    }

    @Test
    public void testAddFourSeasonsToCart() throws InterruptedException {
        menuPage.clickOnPizzas();
        Thread.sleep(2000);
        menuPage.scrollToAndAddFourSeasonsToCart();
        Thread.sleep(2000);
        menuPage.clickOnPickup();
        Thread.sleep(2000);
        menuPage.clickOnGazetaPravda();
}
