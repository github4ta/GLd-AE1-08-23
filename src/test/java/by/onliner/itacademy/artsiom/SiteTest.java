package by.onliner.itacademy.artsiom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {
    WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        String webAddress = "https://verapsu.taplink.ws/";
        driver = new ChromeDriver();
        driver.get(webAddress);
        
    }
    @Test
    public void openSiteTest(){
        String fieldSiteFooterTextXPath = "//span[contains(text(), 'Taplink.ru')]";
        By fieldSiteFooterTextBy = By.xpath(fieldSiteFooterTextXPath);
        WebElement fieldSiteFooterTextWebElement = driver.findElement(fieldSiteFooterTextBy);

        String actualTextMessage = fieldSiteFooterTextWebElement.getText();
        String expectedTextMessage = "Taplink.ru";

        Assertions.assertEquals(expectedTextMessage,actualTextMessage);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}