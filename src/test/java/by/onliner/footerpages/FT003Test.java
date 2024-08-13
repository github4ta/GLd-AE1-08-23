package by.onliner.footerpages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FT003Test extends BaseTest {

    private final String BASE_URL = "https://www.onliner.by/";

    @Test
    public void testWhenUserClickVacanciesThenVacanciesPageOpened() {

        String aVacanciesXPath = "//a[contains(text(),'Вакансии')]";
        By aVacanciesBy = By.xpath(aVacanciesXPath);
        WebElement aVacanciesWebElement = driver.findElement(aVacanciesBy);

        aVacanciesWebElement.click();

        String expectedVacanciesURL = "https://blog.onliner.by/vacancy";
        String actualVacanciesURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedVacanciesURL, actualVacanciesURL, "URL страницы вакансий неверный");

        String titleVacanciesTextXPath = "//div[@class='news-header__title']/h1";
        By titleVacanciesTextBy = By.xpath(titleVacanciesTextXPath);
        WebElement titleVacanciesTextWebElement = driver.findElement(titleVacanciesTextBy);

        String expectedTitleVacanciesText = "Вакансии";
        String actualTitleVacanciesText = titleVacanciesTextWebElement.getText();
        Assertions.assertEquals(expectedTitleVacanciesText, actualTitleVacanciesText);
    }
}
