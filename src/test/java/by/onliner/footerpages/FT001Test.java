package by.onliner.footerpages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FT001Test {

    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void testWhenUserAboutLinkThenAboutPageAboutOpened() {
        //1. Given

        //2. When - act
        String buttonAboutXPath = "//a[@href=\"https://blog.onliner.by/about\"]";
        By buttonAboutBy = By.xpath(buttonAboutXPath);
        WebElement buttonAboutByWebElement = driver.findElement(buttonAboutBy);

        buttonAboutByWebElement.click();

        //3. then
        String aboutPageHeaderXPath = "//*[@id=\"container\"]/div/div[2]/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/h1";
        By aboutPageHeaderBy = By.xpath(aboutPageHeaderXPath);
        WebElement aboutPageHeaderWebElement = driver.findElement(aboutPageHeaderBy);

        String actualAboutPageHeader = aboutPageHeaderWebElement.getText();
        String expectedAboutPageHeader = "Информация о компании";

        Assertions.assertEquals(expectedAboutPageHeader, actualAboutPageHeader);
    }
}
