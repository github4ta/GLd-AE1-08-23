package by.onliner.footerpages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FT005Test extends BaseTest{
    private final String BASE_URL = "https://www.onliner.by/";

    @Test
    public void testWhenUserClickSiteRulesThenSiteRulesOpened() {
        String aSiteRulesXPath = "//a[@href='https://blog.onliner.by/siterules']";
        By aSiteRulesBy = By.xpath(aSiteRulesXPath);
        WebElement aSiteRulesWebElement = driver.findElement(aSiteRulesBy);
        aSiteRulesWebElement.click();

        String expectedSiteRulesURL = "https://blog.onliner.by/siterules";
        String actualSiteRulesURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedSiteRulesURL, actualSiteRulesURL);

        String titleSiteRulesTextXPath = "//div[@class='news-header__title']/h1";
        By titleSiteRulesTextBy = By.xpath(titleSiteRulesTextXPath);
        WebElement titleSiteRulesTextWebElement = driver.findElement(titleSiteRulesTextBy);

        String expectedTitleSiteRulesText = "Пользовательское соглашение/Правила";
        String actualTitleSiteRulesText = titleSiteRulesTextWebElement.getText();
        Assertions.assertEquals(expectedTitleSiteRulesText, actualTitleSiteRulesText);
    }
}
