package by.onliner.homepage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void testHPFT004() {
        String footerLinkManifestPath = "//a[@href='https://blog.onliner.by/manifest']";
        By footerLinkManifestBy = By.xpath(footerLinkManifestPath);
        WebElement footerLinkManifestWebElement = driver.findElement(footerLinkManifestBy);

        String expectedLinkManifestText = "Манифест";
        String actualLinkManifestText = footerLinkManifestWebElement.getText();
        Assertions.assertEquals(expectedLinkManifestText, actualLinkManifestText);
    }



    @Test
    public void testHPFT005() {
        String aUserAgreementXPath = "//a[@href='https://blog.onliner.by/siterules']";
        By aUserAgreementBy = By.xpath(aUserAgreementXPath);
        WebElement aUserAgreementWebElement = driver.findElement(aUserAgreementBy);

        String expectedUserAgreementText = "Пользовательское соглашение";
        String actualUserAgreementText = aUserAgreementWebElement.getText();
        Assertions.assertEquals(expectedUserAgreementText, actualUserAgreementText);
    }

    @Test
    public void testHPFT007() {
        String aPrivacyPolicyXPath = "//a[@href='https://blog.onliner.by/politika-konfidencialnosti']";
        By aPrivacyPolicyBy = By.xpath(aPrivacyPolicyXPath);
        WebElement aPrivacyPolicyWebElement = driver.findElement(aPrivacyPolicyBy);

        String expectedText = "Политика обработки персональных данных";
        String actualText = aPrivacyPolicyWebElement.getText();
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testHPFT010() {
        String footerButtonAdvertisingXPath = "//a[@href='https://b2breg.onliner.by/advertising']";
        WebElement footerButtonAdvertisingWebElement = driver.findElement(By.xpath(footerButtonAdvertisingXPath));
        String actualText = footerButtonAdvertisingWebElement.getText();
        String expectedText = "Реклама";

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testHPFT009() {
        String aRefundRulesXPath = "//a[@href='https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg']";
        By aRefundRulesBy = By.xpath(aRefundRulesXPath);
        WebElement aRefundRulesWebElement = driver.findElement(aRefundRulesBy);

        String expectedRefundRulesText = "Правила возврата";
        String actualRefundRulesText = aRefundRulesWebElement.getText();
        Assertions.assertEquals(expectedRefundRulesText, actualRefundRulesText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
