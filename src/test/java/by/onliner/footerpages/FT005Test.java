package by.onliner.footerpages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT005Test extends FooterBaseTest {
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

    public static class FT002Test {

        WebDriver driver;
        final String urlBase = "https://www.onliner.by/";

        @BeforeEach
        public void beforeEach(){
            driver = new ChromeDriver();
            driver.get(urlBase);
            driver.manage().window().maximize();
        }

        @Test
        public void testWhenUserClickEditorContactsThenContactsOpened() {
            String linkEditorContacts = "//a[contains(text(),'Контакты редакции')]";
            By xPathlinkEditorContacts = By.xpath(linkEditorContacts);
            WebElement webElementEditorContacts = driver.findElement(xPathlinkEditorContacts);
            webElementEditorContacts.click();

            String expectedEditorContactLink = "https://people.onliner.by/contacts";
            String actualEditorContactsLink = driver.getCurrentUrl();
            Assertions.assertEquals(expectedEditorContactLink, actualEditorContactsLink);

            String titleEditorContacts = "//div[@class='news-header__title']";
            By xPathTitleEditorContact = By.xpath(titleEditorContacts);
            WebElement webElementTitleEditorContacts = driver.findElement(xPathTitleEditorContact);

            String expectedTitleEditorContacts =
                    "Контакты редакции. Манифест. Спецпроекты. Правила использования материалов";
            String actualTitleEditorContact = webElementTitleEditorContacts.getText();
            Assertions.assertEquals(expectedTitleEditorContacts, actualTitleEditorContact);
        }

        @AfterEach
        public void afterEach(){
            driver.quit();
        }
    }
}
