package by.onliner.homepage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ST0042 extends BaseTest {

        @Test
        public void testSectionTasks() {
            String topMenuXpath = "//*[@id=\"container\"]/div/div/header/div[2]";
            By topMenuBy = By.xpath(topMenuXpath);
            WebElement topMenuWebElement = driver.findElement(topMenuBy);
            String menuOptionXpath = "//li[contains(@class,'b-main-navigation__item')]";
            By menuOptionBy = By.xpath(menuOptionXpath);
            List<WebElement> menuOptionWebElements = topMenuWebElement.findElements(menuOptionBy);
            WebElement buttonTasksWebElement = menuOptionWebElements.get(4);
            buttonTasksWebElement.click();

            String expectedTasksURL = "https://s.onliner.by/tasks";
            String actualTasksURL = driver.getCurrentUrl();

            Assertions.assertEquals(expectedTasksURL, actualTasksURL);
        }
    }
