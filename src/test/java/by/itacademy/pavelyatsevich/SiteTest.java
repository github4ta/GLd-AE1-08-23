package by.itacademy.pavelyatsevich;

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
        String webAddress = "https://taplink.cc/sublimasha";
        driver = new ChromeDriver();
        driver.get(webAddress);
    }

    @Test
    public void openSiteTest(){
        String fieldSiteEndTextXPath = "//a[@class='footer-link']";
        By fieldSiteEndTextBy = By.xpath(fieldSiteEndTextXPath);
        WebElement fieldSiteEndTextWebElement = driver.findElement(fieldSiteEndTextBy);

        String actualTextMessage = fieldSiteEndTextWebElement.getText();
        String expectedTextMessage = "Сделано на Taplink.ru";

        Assertions.assertEquals(expectedTextMessage,actualTextMessage);
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
