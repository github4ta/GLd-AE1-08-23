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
        // driver.findElement();
    }

    @Test
    public void testButtonNotebook() {
        String buttonNotebookXPath = "//a[@href='https://catalog.onliner.by/notebook']//span[@class='project-navigation__sign']";
        By buttonNotebookBy = By.xpath(buttonNotebookXPath);
        WebElement buttonNotebookWebElement = driver.findElement(buttonNotebookBy);

        String expectedButtonText = "Ноутбуки";
        String actualButtonText = buttonNotebookWebElement.getText();

        Assertions.assertEquals(expectedButtonText, actualButtonText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

}
