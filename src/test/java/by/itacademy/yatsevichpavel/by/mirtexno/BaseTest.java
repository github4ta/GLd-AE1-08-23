package by.itacademy.yatsevichpavel.by.mirtexno;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;
    final String BASE_URL = "https://mirtexno.by/";

    @BeforeEach
    public void initiate(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterEach
    public void stdout(){
        driver.quit();
    }
}
