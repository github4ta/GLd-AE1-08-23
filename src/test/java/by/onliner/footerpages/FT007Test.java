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
import org.openqa.selenium.chrome.ChromeOptions;

public class FT007Test {
    WebDriver driver;
    final String urlBase = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.get(urlBase);
        driver.manage().window().maximize();
    }

    @Test
    public void testWhenUserClickPrivacyPoliticThenPageOpened() {

        String buttonUserPrivacyPolitic = "//a[@href='https://blog.onliner.by/politika-konfidencialnosti']";
        By buttonPrivacyPoliticBy = By.xpath(buttonUserPrivacyPolitic);
        WebElement buttonUPrivacyPoliticWebElement = driver.findElement(buttonPrivacyPoliticBy);
        buttonUPrivacyPoliticWebElement.click();

        String privacyPolitictXpath = "//div[@class='news-header__title']/h1 ";
        By privacyPoliticBy = By.xpath(privacyPolitictXpath);
        WebElement privacyPoliticWebElement = driver.findElement(privacyPoliticBy);
        String actualText = privacyPoliticWebElement.getText();
        String expectedText = "Политика обработки персональных данных ООО «Онлайнер»";

        Assertions.assertEquals(expectedText, actualText);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
