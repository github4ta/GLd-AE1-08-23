package by.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnlinerTest {

    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @Test
    public void testMonitorsLink(){
        driver.manage().window().maximize();

        // Use WebDriverWait to wait for the element to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String xPathMonitorsLink = "//a[@href='https://catalog.onliner.by/display']//span[contains(@class, 'project-navigation__sign')]";
        By byMonitors = By.xpath(xPathMonitorsLink);

        // Wait until the element is present and visible
        WebElement webElementMonitors = wait.until(ExpectedConditions.visibilityOfElementLocated(byMonitors));
        String actualText = webElementMonitors.getText();
        String expectedText = "Мониторы";

        // Print expected and actual results to console
        System.out.println("Expected Text: " + expectedText);
        System.out.println("Actual Text: " + actualText);

        // Assert that the expected and actual text are equal
        Assertions.assertEquals(expectedText, actualText);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
