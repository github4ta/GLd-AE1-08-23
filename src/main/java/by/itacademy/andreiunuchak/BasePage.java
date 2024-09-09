package by.itacademy.andreiunuchak;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected String BASE_URL = "https://pizzamarket.by/";


    BasePage(){
        driver = DriverSingleton.getWebDriver();
    }
}
