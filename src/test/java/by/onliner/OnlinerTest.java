package by.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @Test
    public void test() {
        String videoXpath = "//a[@href=\"https://catalog.onliner.by/videocard\"]";
        By videoXpathBy = By.xpath(videoXpath);
        WebElement videoXpathWebElement = driver.findElement(videoXpathBy);



        // driver.findElement();

        String actualVideoOne = videoXpathWebElement.getText();
        String expectedVideoOne = "Видеокарты";
        Assertions.assertEquals(expectedVideoOne, actualVideoOne);

    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
