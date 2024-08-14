package by.onliner.footerpages;

import by.onliner.Waiters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FT008Test extends BaseTest {

    @Test
    public void testWhenClickOnLinkUserSupportThenUserSupportOpened() {
        Waiters.waitFor(2);
        String linkUserSupportXpath = "//a[@href='https://support.onliner.by']";
        By linkUserSupportBy = By.xpath(linkUserSupportXpath);
        WebElement linkUserSupportWebElement = driver.findElement(linkUserSupportBy);
        linkUserSupportWebElement.click();

        Waiters.waitFor(2);
        String userSupportXpath = "//div[@id='main']/div/h1";
        By userSupportBy = By.xpath(userSupportXpath);
        WebElement userSupportWebElement = driver.findElement(userSupportBy);
        String actualText = userSupportWebElement.getText();
        String expectedText = "Запрос в службу поддержки";

        Assertions.assertEquals(expectedText, actualText);
    }
}
