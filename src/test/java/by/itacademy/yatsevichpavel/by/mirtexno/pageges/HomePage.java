package by.itacademy.yatsevichpavel.by.mirtexno.pageges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;
    private final String MAIN_PAGE_SITE_FOOTER_COPYRITE_PATH = "//div[@data-id='323']/p/span[1]";
    public final String MAIN_PAGE_SITE_FOOTER_COPYRITE_TEXT = "ООО «МирТехноЛайн»";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToFooterCopyriteWebElement(){
        int deltaY = 200;
        new Actions(driver).scrollToElement(getFooterCopyriteWebElement())
                .scrollByAmount(0,deltaY)
                .perform();
    }

    public String getMainPageSiteFooterCopyriteText() {
        return getFooterCopyriteWebElement().getText();
    }

    public WebElement getFooterCopyriteWebElement() {
        return driver.findElement(By.xpath(MAIN_PAGE_SITE_FOOTER_COPYRITE_PATH));
    }
}
