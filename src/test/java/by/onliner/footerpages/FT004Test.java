package by.onliner.footerpages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FT004Test extends FooterBaseTest {

    @Test
    public void testWhenUserClickManifestThenManifestOpened(){
        String aUserManifestXPath = "/html/body/div[1]/footer/div/div/div/div[1]/ul/li[6]/a";
        By aUserManifestoBy = By.xpath(aUserManifestXPath);
        WebElement aUserManifestWebElement = driver.findElement(aUserManifestoBy);
        aUserManifestWebElement.click();

        String expectedSiteManifestURL = "https://blog.onliner.by/manifest";
        String actualManifestURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedSiteManifestURL, actualManifestURL);

        String titleManifestTextXPath = "//*[@id=\"container\"]/div/div[2]/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div/h1";
        By titleManifestTextBy = By.xpath(titleManifestTextXPath);
        WebElement titleManifestTextWebElement = driver.findElement(titleManifestTextBy);

        String expectedTitleText = "Манифест";
        String actualTitleText = titleManifestTextWebElement.getText();
        Assertions.assertEquals(expectedTitleText, actualTitleText);
    }

}
