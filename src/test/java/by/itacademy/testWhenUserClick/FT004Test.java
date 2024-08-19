package by.itacademy.testWhenUserClick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FT004Test {
    private WebDriver driver;
    private final String BASE_URL = "https://www.onliner.by/";

    @BeforeEach
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

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

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
