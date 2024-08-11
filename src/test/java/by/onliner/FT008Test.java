package by.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT008Test {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testWhenClickButtonUserSupportThenUserSupportOpened() {
        Waiters.waitFor(2);
        String buttonUserSupportXpath = "//a[@href='https://support.onliner.by']";
        By buttonUserSupportBy = By.xpath(buttonUserSupportXpath);
        WebElement buttonUserSupportWebElement = driver.findElement(buttonUserSupportBy);
        buttonUserSupportWebElement.click();
        Waiters.waitFor(2);
        String UserSupportXpath = "//div[@id=\'main\']/div/h1";
        By userSupportBy = By.xpath(UserSupportXpath);
        WebElement userSupportWebElement = driver.findElement(userSupportBy);
        String actualText = userSupportWebElement.getText();
        String expectedText = "Запрос в службу поддержки";

        Assertions.assertEquals(expectedText, actualText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
