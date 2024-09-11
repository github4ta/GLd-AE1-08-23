package by.sergeymelnik.mirtechno.packages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    public final static String MAIN_PAGE_STRING_FOOTER = "//div[@data-id='323']/p/span[1]";
    public final static String MAIN_PAGE_STRING_FOOTER_CHECK = "ООО «МирТехноЛайн»";
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMainPageStringFooter(){
       String actual = driver.findElement(By.xpath(HomePage.MAIN_PAGE_STRING_FOOTER)).getText();
        return actual;
    }

    public String getMainPageStringFooterScroll() throws InterruptedException {

        WebElement footerWebElement = driver.findElement(By.xpath(HomePage.MAIN_PAGE_STRING_FOOTER));
        int delay = 100;
        new Actions(driver)
                .scrollToElement(footerWebElement)
                .scrollByAmount(0, delay)
                .perform();
        Thread.sleep(3000);
        String actual = driver.findElement(By.xpath(HomePage.MAIN_PAGE_STRING_FOOTER)).getText();
        return actual;
    }


}
