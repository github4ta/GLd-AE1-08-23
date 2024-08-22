package by.itacademy.denisbaranov;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    BasePage() {
        driver = DriverSingleton.getWebDriver();
    }
}
