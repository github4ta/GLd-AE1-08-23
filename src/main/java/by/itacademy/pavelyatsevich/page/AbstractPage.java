package by.itacademy.pavelyatsevich.page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;

    public abstract AbstractPage openPage();

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
