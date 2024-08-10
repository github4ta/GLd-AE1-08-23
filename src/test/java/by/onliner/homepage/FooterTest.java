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

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
