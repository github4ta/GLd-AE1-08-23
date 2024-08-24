package by.itacademy.dmitriymedvedev;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePapaJohnsTest {
    WebDriver driver;
    private final String BASE_URL = "https://papajohns.ru/";

    @BeforeEach
    public void setUpDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}