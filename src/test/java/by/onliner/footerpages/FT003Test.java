package by.onliner.footerpages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FT003Test extends by.onliner.homepage.BaseTest {

    @Test
    public void testWhenUserClickVacanciesThenVacanciesPageOpened() {

        assert driver != null : "WebDriver не был инициализирован в BaseTest";

        String aVacanciesXPath = "//a[contains(text(),'Вакансии')]";
        By aVacanciesBy = By.xpath(aVacanciesXPath);
        WebElement aVacanciesWebElement = driver.findElement(aVacanciesBy);

        aVacanciesWebElement.click();

        String expectedVacanciesURL = "https://blog.onliner.by/vacancy";
        String actualVacanciesURL = driver.getCurrentUrl();
        assertEquals(expectedVacanciesURL, actualVacanciesURL, "URL страницы вакансий неверный");

        String titleVacanciesTextXPath = "//div[@class='news-header__title']/h1";
        By titleVacanciesTextBy = By.xpath(titleVacanciesTextXPath);
        WebElement titleVacanciesTextWebElement = driver.findElement(titleVacanciesTextBy);

        String expectedTitleVacanciesText = "Вакансии";
        String actualTitleVacanciesText = titleVacanciesTextWebElement.getText();
        assertEquals(expectedTitleVacanciesText, actualTitleVacanciesText, "Текст заголовка страницы вакансий неверный");
    }
}
