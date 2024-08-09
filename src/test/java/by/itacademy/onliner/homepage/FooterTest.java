package by.itacademy.onliner.homepage;

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
        driver.get(BASE_URL);
    }

    @Test
    public void testHPFT003() {
        String linkVacanciesXPath = "/html/body/div[1]/footer/div/div/div/div[1]/ul/li[5]/a";
        By linkVacanciesBy = By.xpath(linkVacanciesXPath);
        WebElement linkVacanciesWebElement = driver.findElement(linkVacanciesBy);
        String expectedLinkVacancies = linkVacanciesWebElement.getText();
        String actualLinkVacancies = "Вакансии";
        Assertions.assertEquals(expectedLinkVacancies, actualLinkVacancies);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
