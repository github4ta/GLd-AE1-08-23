package by.onliner.footerpages;

import by.onliner.Waiters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT010Test {
    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testWhenUserClickAdvertisingThenAdvertisingOpened() {
        String footerLinkAdvertisingPath = "//a[@href='https://b2breg.onliner.by/advertising']";
        By footerLinkAdvertisingBy = By.xpath(footerLinkAdvertisingPath);
        WebElement footerLinkAdvertisingWebElement = driver.findElement(footerLinkAdvertisingBy);
        String expectedLinkAdvertisingText = "Реклама";
        String actualLinkAdvertisingText = footerLinkAdvertisingWebElement.getText();
        Assertions.assertEquals(expectedLinkAdvertisingText, actualLinkAdvertisingText);
        footerLinkAdvertisingWebElement.click();
        String expectedTitlePageAdvertising = "Подключиться к каталогу";
        String actualTitlePageAdvertising = driver.getTitle();
        Assertions.assertEquals(expectedTitlePageAdvertising, actualTitlePageAdvertising);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
