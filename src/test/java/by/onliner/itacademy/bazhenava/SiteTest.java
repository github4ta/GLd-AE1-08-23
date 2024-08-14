package by.onliner.itacademy.bazhenava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {
    static WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        String webAddress = "https://psychologists.taplink.ws";
        driver = new ChromeDriver();
        driver.get(webAddress);
    }

    @Test
    public void openAndDownloadSite() {
        String openAndDownloadTextXPath = "//span[contains(text(), 'Taplink.ru')]";
        By openAndDownloadTextBy = By.xpath(openAndDownloadTextXPath);
        WebElement openAndDownloadWebElement = driver.findElement(openAndDownloadTextBy);

        String actualTextMessage = openAndDownloadWebElement.getText();
        String expectedTextMessage = "Taplink.ru";

        Assertions.assertEquals(expectedTextMessage, actualTextMessage);
    }

    @AfterEach
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
