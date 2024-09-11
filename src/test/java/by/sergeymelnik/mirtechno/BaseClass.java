package by.sergeymelnik.mirtechno;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    WebDriver driver;
    private final static String BASE_URL = "https://mirtexno.by/";

    @BeforeEach
    public void initiate(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
