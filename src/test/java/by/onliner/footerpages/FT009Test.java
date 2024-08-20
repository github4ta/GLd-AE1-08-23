package by.onliner.footerpages;

import by.onliner.Waiters;
import by.onliner.homepage.HomeBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT009Test {
    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @Test
    public void testWhenUserClickReturnPolicyThenRulesForReturningGoodsAndMoney() {
        String linkReturnPolicyXPath = "//a[@href='https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg']";
        By linkReturnPolicyBy = By.xpath(linkReturnPolicyXPath);
        WebElement linkReturnPolicyWebElement = driver.findElement(linkReturnPolicyBy);
        linkReturnPolicyWebElement.click();

        String pageRulesForReturningGoodsAndMoneyXPath = "//div[@class='news-header__title']/h1";
        By pageRulesForReturningGoodsAndMoneyBy = By.xpath(pageRulesForReturningGoodsAndMoneyXPath);
        WebElement pageRulesForReturningGoodsAndMoneyWebElement = driver.findElement(pageRulesForReturningGoodsAndMoneyBy);

        String expectedPageRulesForReturningGoodsAndMoney = pageRulesForReturningGoodsAndMoneyWebElement.getText();
        String actualPageRulesForReturningGoodsAndMoney = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedPageRulesForReturningGoodsAndMoney, actualPageRulesForReturningGoodsAndMoney);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    public static class FT008Test extends HomeBaseTest {

        @Test
        public void testWhenClickLinkUserSupportThenUserSupportOpened() {
            Waiters.waitFor(2);
            String linkUserSupportXpath = "//a[@href='https://support.onliner.by']";
            By linkUserSupportBy = By.xpath(linkUserSupportXpath);
            WebElement linkUserSupportWebElement = driver.findElement(linkUserSupportBy);
            linkUserSupportWebElement.click();
            Waiters.waitFor(2);
            String userSupportXpath = "//div[@id='main']/div/h1";
            By userSupportBy = By.xpath(userSupportXpath);
            WebElement userSupportWebElement = driver.findElement(userSupportBy);
            String actualLinkText = userSupportWebElement.getText();
            String expectedLinkText = "Запрос в службу поддержки";

            Assertions.assertEquals(expectedLinkText, actualLinkText);
        }
    }
}
