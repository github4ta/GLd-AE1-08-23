package by.itacademy.sergeymelnik;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverSingletone.getWebDriver();
    }
}
