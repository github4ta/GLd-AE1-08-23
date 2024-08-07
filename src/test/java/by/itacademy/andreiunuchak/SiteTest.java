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
