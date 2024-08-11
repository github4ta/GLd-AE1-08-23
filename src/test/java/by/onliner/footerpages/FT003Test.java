package by.onliner.footerpages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FT003Test {
    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testWhenUserClickVacanciesThenVacanciesPageOpened() {
        String aVacanciesXPath = "//a[@href='https://blog.onliner.by/vacancy']";
        By aVacanciesBy = By.xpath(aVacanciesXPath);
        WebElement aVacanciesWebElement = driver.findElement(aVacanciesBy);
        aVacanciesWebElement.click();

        String expectedVacanciesURL = "https://blog.onliner.by/vacancy";
        String actualVacanciesURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedVacanciesURL, actualVacanciesURL);

        String titleVacanciesTextXPath = "//div[@class='news-header__title']/h1";
        By titleVacanciesTextBy = By.xpath(titleVacanciesTextXPath);
        WebElement titleVacanciesTextWebElement = driver.findElement(titleVacanciesTextBy);

        String expectedTitleVacanciesText = "Вакансии";
        String actualTitleVacanciesText = titleVacanciesTextWebElement.getText();
        Assertions.assertEquals(expectedTitleVacanciesText, actualTitleVacanciesText);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
