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
    public void testWatchesAndBracelets() {
        String linkWatchesAndBraceletsXPath = "//*[@id=\"container\"]/div/div/div/div/div[1]/div/div[1]/ul[2]/li[6]/a/span/span=XPath";
        By linkWatchesAndBraceletsBy = By.xpath(linkWatchesAndBraceletsXPath);
        WebElement linkWatchesAndBraceletsWebElement = driver.findElement(linkWatchesAndBraceletsBy);
        String expectedLinkWatchesAndBracelets = linkWatchesAndBraceletsWebElement.getText();
        String actualLinkWatchesAndBracelets = "Умные часы и браслеты";
        Assertions.assertEquals(expectedLinkWatchesAndBracelets, actualLinkWatchesAndBracelets);
        // driver.findElement();
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
