package by.onliner.homepage;

import by.onliner.homepage.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT001Test extends BaseTest {


    @Test
    public void testWhenUserAboutLinkThenAboutPageAboutOpened() {
        //1. Given

        //2. When - act
        String linkAboutXPath = "//a[@href=\"https://blog.onliner.by/about\"]";
        By linkAboutBy = By.xpath(linkAboutXPath);
        WebElement linkAboutByWebElement = driver.findElement(linkAboutBy);

        linkAboutByWebElement.click();

        //3. then
        String aboutPageHeaderXPath = "//div[@class = \"news-text\"]/h1";
        By aboutPageHeaderBy = By.xpath(aboutPageHeaderXPath);
        WebElement aboutPageHeaderWebElement = driver.findElement(aboutPageHeaderBy);

        String actualAboutPageHeader = aboutPageHeaderWebElement.getText();
        String expectedAboutPageHeader = "Информация о компании";

        Assertions.assertEquals(expectedAboutPageHeader, actualAboutPageHeader);
    }
}
