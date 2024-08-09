package by.onliner.homepage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterTest {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testHPFT009() {
        String aRefundRulesXPath = "//a[@href='https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg']";
        By aRefundRulesBy = By.xpath(aRefundRulesXPath);
        WebElement aRefundRulesWebElement = driver.findElement(aRefundRulesBy);

        String expectedRefundRulesText = "Правила возврата";
        String actualRefundRulesText = aRefundRulesWebElement.getText();
        Assertions.assertEquals(expectedRefundRulesText, actualRefundRulesText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
