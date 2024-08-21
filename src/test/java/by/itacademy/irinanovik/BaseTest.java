package by.itacademy.irinanovik;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    protected void driverSetUp() {
        driver = DriverSingleton.getWebDriver();
    }

    @AfterEach
    protected void driverTearDown() {
        DriverSingleton.closeDriver();
    }
}
