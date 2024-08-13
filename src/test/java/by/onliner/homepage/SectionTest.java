package by.onliner.homepage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SectionTest extends BaseTest {

    @Test
    public void testSectionBaraholka(){
        String topMenuXpath = "//ul[@class='b-main-navigation']";
        By topMenuBy = By.xpath(topMenuXpath);
        WebElement topMenuWebElement = driver.findElement(topMenuBy);
        String menuOptionXpath = "//li[contains(@class,'b-main-navigation__item')]";
        By menuOptionBy = By.xpath(menuOptionXpath);
        List<WebElement> menuOptionWebElements = topMenuWebElement.findElements(menuOptionBy);
        WebElement buttonBaraholkaWebElement = menuOptionWebElements.get(5);
        buttonBaraholkaWebElement.click();

        String expectedBaraholkaURL = "https://baraholka.onliner.by/";
        String actualBaraholkaURL = driver.getCurrentUrl();

        Assertions.assertEquals(expectedBaraholkaURL, actualBaraholkaURL);
    }
}
