package by.itacademy.antonzinko.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    BasePage() {
        driver = DriverSingleton.getWebDriver();
    }
}
