package zaitseva.olga;

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
    public void beforeEach() {
        //1.Given
        driver = new ChromeDriver();
        driver.get("https://oksanakozireva.ru/taplinkinstagram");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void whenFoundText() {
        //2. When
        String linkTextXpath = "//a[@href='https://tilda.ru/?upm=2655819']";
        By linkTextBy = By.xpath(linkTextXpath);
        WebElement linkTextWebElement = driver.findElement(linkTextBy);
        linkTextWebElement.click();

        //3. Tnen
        String linkTextTildaXpath = "//div[@class='t934__title']";
        By linkTextTildaXpathBy = By.xpath(linkTextTildaXpath);
        WebElement linkTextTildaWebElement = driver.findElement(linkTextTildaXpathBy);
        String actuallinkTextTilda = linkTextTildaWebElement.getText();
        String expectedlinkTextTilda = "Tilda Publishing";
        Assertions.assertEquals(expectedlinkTextTilda, actuallinkTextTilda);

    }
}



