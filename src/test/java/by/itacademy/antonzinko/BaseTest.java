package by.itacademy.antonzinko;

import by.itacademy.antonzinko.pages.DriverSingleton;
import by.itacademy.antonzinko.utils.Waiters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest extends Waiters {
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
