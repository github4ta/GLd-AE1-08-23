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
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @Test
    public void testWhenUserClickAdvertisingThenAdvertisingOpened() {
        String footerLinkAdvertisingXPath = "//a[@href='https://b2breg.onliner.by/advertising']";
        By footerLinkAdvertisingBy = By.xpath(footerLinkAdvertisingXPath);
        WebElement footerLinkAdvertisingWebElement = driver.findElement(footerLinkAdvertisingBy);
        footerLinkAdvertisingWebElement.click();
        String pageTitleAdvertisingXPath = "//div[@class='title-style title-style_primary-alter title-style_giant-other b2breg-advertising__title']";
        By pageTitleAdvertisingBy = By.xpath(pageTitleAdvertisingXPath);
        WebElement pageTitleAdvertisingWebElement = driver.findElement(pageTitleAdvertisingBy);
        String expectedPageTitleAdvertising = "Реклама на сайте Onlíner";
        String actualPageTitleAdvertising = pageTitleAdvertisingWebElement.getText();
        Assertions.assertEquals(expectedPageTitleAdvertising, actualPageTitleAdvertising);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
