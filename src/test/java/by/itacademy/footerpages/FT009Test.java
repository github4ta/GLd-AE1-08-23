package by.itacademy.footerpages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FT009Test extends BaseTest {

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
    
}
