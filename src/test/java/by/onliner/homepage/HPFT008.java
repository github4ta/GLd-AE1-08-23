package by.onliner.homepage;

import by.onliner.Waiters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPFT008 {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testHPFT008() {
        driver.manage().window().maximize();
        Waiters.waitFor(2);
        String footerElementXpath = "/html/body/div[1]/footer/div/div/div/div[1]/ul/li[10]/a";
        By footerElementBy = By.xpath(footerElementXpath);
        WebElement footerWebElement = driver.findElement(footerElementBy);

        String actualText = footerWebElement.getText();
        String expectedText = "Поддержка пользователей";
        Assertions.assertEquals(expectedText, actualText);
    }
    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
