package by.onliner.footerpages;

import by.onliner.homepage.FooterTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FT005Test{
    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testWhenUserClickSiteRulesThenSiteRulesOpened(){
        String aUserAgreementXPath = "//a[@href='https://blog.onliner.by/siterules']";
        By aUserAgreementBy = By.xpath(aUserAgreementXPath);
        WebElement aUserAgreementWebElement = driver.findElement(aUserAgreementBy);
        aUserAgreementWebElement.click();

        String expectedSiteRulesURL = "https://blog.onliner.by/siterules";
        String actualSiteRulesURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedSiteRulesURL, actualSiteRulesURL);

        String titleSiteRulesTextXPath = "//div[@class='news-header__title']/h1";
        By titleSiteRulesTextBy = By.xpath(titleSiteRulesTextXPath);
        WebElement titleSiteRulesTextWebElement = driver.findElement(titleSiteRulesTextBy);

        String expectedTitleText = "Пользовательское соглашение/Правила";
        String actualTitleText = titleSiteRulesTextWebElement.getText();
        Assertions.assertEquals(expectedTitleText, actualTitleText);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
