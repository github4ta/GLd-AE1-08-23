package by.onliner.footerpages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FT002Test {

    WebDriver driver;
    final String urlBase = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.get(urlBase);
        driver.manage().window().maximize();
    }

    @Test
    public void testWhenUserClickEditorContactsThenContactsOpened() {
        String linkEditorContacts = "//a[contains(text(),'Контакты редакции')]";
        By xPathlinkEditorContacts = By.xpath(linkEditorContacts);
        WebElement webElementEditorContacts = driver.findElement(xPathlinkEditorContacts);
         webElementEditorContacts.click();
        String expectedEditorContactLink = "https://people.onliner.by/contacts";
        String actualEditorContactsLink = driver.getCurrentUrl();
        Assertions.assertEquals(expectedEditorContactLink, actualEditorContactsLink);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }

}
