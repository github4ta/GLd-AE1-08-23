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
        WebElement referencePublicAgreementsWebElement = driver.findElement(By.xpath(referencePublicAgreementsXPath));
        referencePublicAgreementsWebElement.click();

        String titleFieldPublicAgreementsPageXPath = "//div[@class='news-header__title']";
        WebElement titleFieldPublicAgreementsPageWebElement = driver.findElement(By.xpath(titleFieldPublicAgreementsPageXPath));
        String actualFieldText = titleFieldPublicAgreementsPageWebElement.getText();
        String exceptedFieldText = "Публичные договоры";

        Assertions.assertEquals(exceptedFieldText, actualFieldText);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
