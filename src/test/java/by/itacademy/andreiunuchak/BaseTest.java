package by.itacademy.andreiunuchak;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @AfterEach
    protected void driverTearDown() {
        DriverSingleton.closeDriver();
    }
}
