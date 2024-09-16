package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.driver.ChromeDriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class CommonCondition {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = ChromeDriverSingleton.getDriver();
    }

    @AfterEach
    public void shutDown() {
        ChromeDriverSingleton.closeDriver();
    }
}
