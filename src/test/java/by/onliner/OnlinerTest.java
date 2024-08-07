package by.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @Test
    public void test() {
        // driver.findElement();
    }

    @Test
    public void testAirphoneLink() {
        driver.manage().window().maximize();
        String xPathAiphonesLink="//a[@href=\"https://catalog.onliner.by/headphones\"] [@class=\"project-navigation__link project-navigation__link_primary\"]";
        By byAirphones = By.xpath(xPathAiphonesLink);
        WebElement webElementAirphone = driver.findElement(byAirphones);
        String actualTest = webElementAirphone.getText();
        String expectedTest = "Наушники и гарнитуры";
        Assertions.assertEquals(expectedTest,actualTest);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
