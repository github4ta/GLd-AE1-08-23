package by.onliner.homepage;

import by.onliner.Waiters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SectionTest extends HomeBaseTest {

    @Test
    public void testWhenClickButtonForumThenForumOpened() {
        Waiters.waitFor(1);
        String buttonForumXpath = "//*[@id='container']/div/div/div/div/div[18]/header/h2/a";
        By buttonForumBy = By.xpath(buttonForumXpath);
        WebElement buttonForumWebElement = driver.findElement(buttonForumBy);
        buttonForumWebElement.click();

        Waiters.waitFor(1);
        String forumXpath = "//*[@id='minWidth']/div/div[2]/div[2]/div/div[2]/h1";
        By forumBy = By.xpath(forumXpath);
        WebElement forumWebElement = driver.findElement(forumBy);
        String actualForumText = forumWebElement.getText();
        String expectedForumText = "Форум";

        Assertions.assertEquals(expectedForumText, actualForumText);
    }

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
