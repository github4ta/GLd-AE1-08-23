package by.itacademy.andreiunuchak;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class SiteTest {
    WebDriver driver;

    @BeforeEach
    public void setUp(){
        String baseURL = "https://taplink.cc/";
        String subURL = "katya.psiholog";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseURL + subURL);
    }

    @Test
    public void testWebsiteLoading(){
        String titleContactMeXpath = "//h2[@block_id='20309086']";
        By titleContactMeBy = By.xpath(titleContactMeXpath);
        waitForPresence(titleContactMeBy);
        WebElement titleContactMeWebElement = driver.findElement(titleContactMeBy);

        String expectedTitleContactMe = "Связаться со мной";
        String actualTitleContactMe = titleContactMeWebElement.getText();
        Assertions.assertEquals(expectedTitleContactMe, actualTitleContactMe);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    private void waitForPresence(By by) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Exception e) {
            System.out.println("Timeout exception.");
        }
    }
}
