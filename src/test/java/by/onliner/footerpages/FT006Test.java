package by.onliner.footerpages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT006Test {
    private WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        String workingPageURL = "https://www.onliner.by/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(workingPageURL);
    }


    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
