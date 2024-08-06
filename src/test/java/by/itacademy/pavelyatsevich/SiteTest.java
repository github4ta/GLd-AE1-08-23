package by.itacademy.pavelyatsevich;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {
    WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        String webAddress = "https://taplink.cc/sublimasha";
        driver = new ChromeDriver();
        driver.get(webAddress);
    }

    @Test
    public void openSiteTest(){

    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
