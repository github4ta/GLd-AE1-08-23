package by.itacademy.andreiunuchak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SiteTest {
    WebDriver driver;

    @BeforeEach
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void testWebsiteLoading(){
        String url = "https://taplink.cc/katya.psiholog";
        driver.get(url);

        String headerContactMeXpath = "//h2[@block_id='20309086']";
        By headerContactMeBy = By.xpath(headerContactMeXpath);
        waitForPresence(headerContactMeBy);
        WebElement headerContactMeWebElement = driver.findElement(headerContactMeBy);

        String expectedHeaderContactMe = "Связаться со мной";
        String actualHeaderContactMe = headerContactMeWebElement.getText();
        Assertions.assertEquals(expectedHeaderContactMe, actualHeaderContactMe);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    public void waitForPresence(By by) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Exception e) {
            System.out.println("Timeout exception.");
        }
    }
}
