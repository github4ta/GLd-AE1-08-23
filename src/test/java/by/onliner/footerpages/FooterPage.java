package by.onliner.footerpages;

import by.onliner.homepage.HomeBaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FooterPage {

    public static final String expectedSiteRulesURL = "https://blog.onliner.by/siterules";

    public static By aSiteRulesBy = By.xpath("//a[@href='https://blog.onliner.by/siterules']");
    public static By titleSiteRulesTextBy = By.xpath("//div[@class='news-header__title']/h1");

    public static class FT001Test extends HomeBaseTest {


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
}
