package by.itacademy.dmitriymedvedev;

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
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://taplink-irinachekanova.ru/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void test1() {
        String fieldWithEmailXPath = "//a[@href='mailto:irina.chekanova.astrolog@gmail.com']";;
        By fieldWithEmailBy = By.xpath(fieldWithEmailXPath);
        WebElement fieldWithEmailWebElement = driver.findElement(fieldWithEmailBy);

        String actualVisibleEmail = fieldWithEmailWebElement.getText();
        String expectedVisibleEmail = "irina.chekanova.astrolog@gmail.com";
        Assertions.assertEquals(expectedVisibleEmail, actualVisibleEmail);
    }
}
