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

    public void testSSD() {
        driver.manage().window().maximize();
        String footerXpath = "//a[@href='https://catalog.onliner.by/ssd']/span/span";
        By footerBy = By.xpath(footerXpath);
        WebElement footerWebElement = driver.findElement(footerBy);

        String actualText = footerWebElement.getText();
        String expectedTextMessage = "SSD";

        Assertions.assertEquals(expectedTextMessage, actualText);
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

    @Test
    public void testProcessors() {
        driver.manage().window().maximize();
        String fieldSiteEndTextXPath = "//a[@href='https://catalog.onliner.by/cpu']/span/span";
        By fieldSiteEndTextBy = By.xpath(fieldSiteEndTextXPath);
        WebElement fieldSiteEndTextWebElement = driver.findElement(fieldSiteEndTextBy);

        String actualTextMessage = fieldSiteEndTextWebElement.getText();
        String expectedTextMessage = "Процессоры";

        Assertions.assertEquals(expectedTextMessage, actualTextMessage);
    }

    @Test
    public void testMonitorsLink() {
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String xPathMonitorsLink = "//a[@href='https://catalog.onliner.by/display']//span[contains(@class, 'project-navigation__sign')]";
        By byMonitors = By.xpath(xPathMonitorsLink);

        WebElement webElementMonitors = wait.until(ExpectedConditions.visibilityOfElementLocated(byMonitors));
        String actualText = webElementMonitors.getText();
        String expectedText = "Мониторы";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testAirphoneLink() {
        driver.manage().window().maximize();
        String xPathAiphonesLink = "//a[@href=\"https://catalog.onliner.by/headphones\"] [@class=\"project-navigation__link project-navigation__link_primary\"]";
        By byAirphones = By.xpath(xPathAiphonesLink);
        WebElement webElementAirphone = driver.findElement(byAirphones);
        String actualTest = webElementAirphone.getText();
        String expectedTest = "Наушники и гарнитуры";
        Assertions.assertEquals(expectedTest, actualTest);
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

    @Test
    public void testCleanersLink() {
        driver.manage().window().maximize();
        String xPathCleanerLink = "//a[@href='https://catalog.onliner.by/vacuumcleaner']/span/span";
        By byCleaners = By.xpath(xPathCleanerLink);
        WebElement webElementCleaners = driver.findElement(byCleaners);
        String actualText = webElementCleaners.getText();
        String expetedText = "Пылесосы";
        Assertions.assertEquals(expetedText, actualText);
    }

    @Test
    public void testUIButtonTVs() {
        String fieldButtonTVsXPath = "//a[@href='https://catalog.onliner.by/tv']/span/span";
        WebElement buttonTVsWebElement = driver.findElement(By.xpath(fieldButtonTVsXPath));
        String actualText = buttonTVsWebElement.getText();
        String expectedText = "Телевизоры";

        Assertions.assertEquals(expectedText, actualText);

    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
