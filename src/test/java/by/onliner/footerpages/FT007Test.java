package by.onliner.footerpages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT007Test {
    private WebDriver driver;
    private final String urlBase = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(urlBase);
    }

    @Test
    public void testWhenUserClickPrivacyPoliticThenPageOpened() {

        String buttonPrivacyPoliticXPath = "//a[@href='https://blog.onliner.by/politika-konfidencialnosti']";
        By buttonPrivacyPoliticBy = By.xpath(buttonPrivacyPoliticXPath);
        WebElement buttonPrivacyPoliticWebElement = driver.findElement(buttonPrivacyPoliticBy);
        buttonPrivacyPoliticWebElement.click();

        String privacyPoliticXpath = "//div[@class='news-header__title']/h1 ";
        By privacyPoliticBy = By.xpath(privacyPoliticXpath);
        WebElement privacyPoliticWebElement = driver.findElement(privacyPoliticBy);
        String actualText = privacyPoliticWebElement.getText();
        String expectedText = "Политика обработки персональных данных ООО «Онлайнер»";

        Assertions.assertEquals(expectedText, actualText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
