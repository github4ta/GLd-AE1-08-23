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
        driver.get(BASE_URL);
    }

    @Test
    public void testWhenUserClickSiteOnlinerThenUserSupportOpened() {
        driver.manage().window().maximize();
        Waiters.waitFor(2);
        String buttonUserSupportXpath = "//a[@href='https://support.onliner.by']";
        By buttonUserSupportBy = By.xpath(buttonUserSupportXpath);
        WebElement buttonUserSupportWebElement = driver.findElement(buttonUserSupportBy);
        buttonUserSupportWebElement.click();

        String UserSupportXpath = "//div[@id=\"main\"]/div/h1";
        By UserSupportBy = By.xpath(UserSupportXpath);
        WebElement UserSupportWebElement = driver.findElement(UserSupportBy);
        String actualText = UserSupportWebElement.getText();
        String expectedText = "Запрос в службу поддержки";
        Assertions.assertEquals(expectedText, actualText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
