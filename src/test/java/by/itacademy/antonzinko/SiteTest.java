package by.itacademy.antonzinko;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {
    WebDriver driver;

    @BeforeEach
    public void BeforeEach() {
        String webAddress = "https://www.alla-kovtunenko.com/";
        driver = new ChromeDriver();
        driver.get(webAddress);
    }

    @Test
    public void test1() {
        String linkGmailPath = "//a[@href='http://squarespace.com']";
        By linkGmailByXPath = By.xpath(linkGmailPath);
        WebElement linkWebElement = driver.findElement(linkGmailByXPath);
        String expectedLinkGmail = "alla.kovtunenko20@gmail.com";
        String actualLinkGmail = linkWebElement.getText();
        Assertions.assertEquals(expectedLinkGmail, actualLinkGmail);
    }

    @AfterEach
    public void AfterEach() {
        driver.quit();
    }
}
