package by.onliner.footerpages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT006Test {
    private WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        String workingPageURL = "https://www.onliner.by/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(workingPageURL);
    }

    @Test
    public void testWhenUserClickPublicAgreementsThenPublicAgreementsPageOpened() {
        String referencePublicAgreementsXPath = "//a[@href='https://blog.onliner.by/publichnye-dogovory']";
        By referencePublicAgreementsBy = By.xpath(referencePublicAgreementsXPath);
        WebElement referencePublicAgreementsWebElement = driver.findElement(referencePublicAgreementsBy);
        referencePublicAgreementsWebElement.click();

        String titleFieldPublicAgreementsPageXPath = "//div[@class='news-header__title']";
        By titleFieldPublicAgreementsPageBy = By.xpath(titleFieldPublicAgreementsPageXPath);
        WebElement titleFieldPublicAgreementsPageWebElement = driver.findElement(titleFieldPublicAgreementsPageBy);
        String actualFieldText = titleFieldPublicAgreementsPageWebElement.getText();
        String exceptedFieldText = "Публичные договоры";

        Assertions.assertEquals(exceptedFieldText, actualFieldText);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
