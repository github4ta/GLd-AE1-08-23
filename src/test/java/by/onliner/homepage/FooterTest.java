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
    public void testHPFT002() {
        driver.manage().window().maximize();
        Waiters.waitFor(2);
        String footerElementXpath = "//a[@href ='https://people.onliner.by/contacts']";
        By footerElementBy = By.xpath(footerElementXpath);
        WebElement footerWebElement = driver.findElement(footerElementBy);

        String actualText = footerWebElement.getText();
        String expectedText = "Контакты редакции";
        Assertions.assertEquals(expectedText, actualText);
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
    public void testHPFT006() {
        Waiters.waitFor(3);
        //String xPathPublicAgreement = "//a[@href='https://blog.onliner.by/publichnye-dogovory']";
        String xPathPublicAgreement = "//a[contains(text(), 'Публичные договоры')]";
        By byFooterPublicAgreement = By.xpath(xPathPublicAgreement);
        WebElement webElementPublicAgreement = driver.findElement(byFooterPublicAgreement);

        String expectedTextPublicAgreement = "Публичные договоры";
        String actualResultPublicAgreement = webElementPublicAgreement.getText();
        Assertions.assertEquals(expectedTextPublicAgreement, actualResultPublicAgreement);

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
    public void testHPFT001() {
        String aboutKompanyXPath = "//a[@href='https://blog.onliner.by/about'] ";
        By aboutKompanyBy = By.xpath(aboutKompanyXPath);
        WebElement aboutKompanyWebElement = driver.findElement(aboutKompanyBy);

        String expectedAboutKompanyText =  "О компании";
        String actualAboutKompanyText = aboutKompanyWebElement.getText();
        Assertions.assertEquals(expectedAboutKompanyText, actualAboutKompanyText);
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
