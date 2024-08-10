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

public class FooterTest {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testHPFT002() {
        driver.manage().window().maximize();
        Waiters.waitFor(2);
        String footerElementXpath = "//a[@href ='https://people.onliner.by/contacts']";
        By footerBy = By.xpath(footerElementXpath);
        WebElement footerWebElement = driver.findElement(footerBy);

        String actualText = footerWebElement.getText();
        String expectedText = "Контакты редакции";
        Assertions.assertEquals(expectedText, actualText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
