package by.onliner.homepage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class TestST002 extends BaseTest {

    @Test
    public void testNewsLink() throws InterruptedException {
        String headLink = "//ul[@class='b-main-navigation']";
        By byHeaderPanel = By.xpath(headLink);
        WebElement webElementHeadLink = driver.findElement(byHeaderPanel);
        String headElements = "//li[contains(@class,'b-main-navigation__item')]";
        By headMenu = By.xpath(headElements);

        List<WebElement> webElementSHeadPanel = webElementHeadLink.findElements(headMenu);
        WebElement webElementNews = null;
        int i = 0;
        for (WebElement webElement : webElementSHeadPanel) {
                if (webElement.getText().contains("Новости")) {
                webElementNews = webElement;
                break;
            }
        }

        new Actions(driver).clickAndHold(webElementNews).perform();
        Thread.sleep(2000);
        String newsPanel = "//div[@class='b-main-navigation__dropdown b-main-navigation__dropdown_visible']";
        By byNewsPanel = By.xpath(newsPanel);
        WebElement webElementXX = driver.findElement(byNewsPanel);
        String dropDown = "//div[@class='b-main-navigation__dropdown-column b-main-navigation__dropdown-column_25']";
        By byXPathDropDown = By.xpath(dropDown);
        List<WebElement> webElementsNewsPanel = webElementXX.findElements(byXPathDropDown);
        WebElement webElementPeople = null;
        WebElement webElementAuto = null;
        WebElement webElementTechnology = null;
        WebElement webElementRealt = null;
        for (WebElement webElement : webElementsNewsPanel) {
            if (webElement.getText().contains("Люди")) {
                webElementPeople = webElement;
            } else if (webElement.getText().contains("Авто")) {
                webElementAuto = webElement;
            } else if (webElement.getText().contains("Технологии")) {
                webElementTechnology = webElement;
            } else if (webElement.getText().contains("Недвижимость")) {
                webElementRealt =webElement;
            }
        }
        webElementNews.click();
        String expectedNewsURL = "https://www.onliner.by/";
        String actualNewsLink = driver.getCurrentUrl();
        Assertions.assertEquals(expectedNewsURL, actualNewsLink);

    }
}
