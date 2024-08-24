package by.itacademy.sergeymelnik;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    protected void driverSetUp(){

        driver = DriverSingletone.getWebDriver();
    }

    @AfterEach
    protected void closeDriver(){
        DriverSingletone.closeDriver();
    }



}
