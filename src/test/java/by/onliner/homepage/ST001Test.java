package by.onliner.homepage;

import by.onliner.Waiters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ST001Test extends BaseTest {
        @Test
        public void testWhenUserClickCatalogLinkThenCatalogPageOpened() {
            String linkCatalogXPath = "//a[contains(text(),'Каталог')]";
            By linkCatalogBy = By.xpath(linkCatalogXPath);
            WebElement linkCatalogByWebElement = driver.findElement(linkCatalogBy);

            linkCatalogByWebElement.click();

            String catalogPageHeaderXPath = "//h1[contains(text(), 'Каталог')]";
            By catalogPageHeaderBy = By.xpath(catalogPageHeaderXPath);
            WebElement catalogPageHeaderWebElement = driver.findElement(catalogPageHeaderBy);

            String actualCatalogPageHeader = catalogPageHeaderWebElement.getText();
            String expectedCatalogPageHeader = "Каталог";

            Assertions.assertEquals(expectedCatalogPageHeader, actualCatalogPageHeader);
            String expectedCatalogURL = "https://catalog.onliner.by/";
            String actualCatalogURL = driver.getCurrentUrl();
            Assertions.assertEquals(expectedCatalogURL, actualCatalogURL);
        }
    }