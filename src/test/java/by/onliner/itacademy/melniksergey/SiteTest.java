package by.onliner.itacademy.melniksergey;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {

    WebDriver webDriver;


    @BeforeEach
    public void testStartBrowserCheckLink(){

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        String url = "https://taplink.cc/psychologist";
        webDriver.get(url);
    }

    @AfterEach
    public void tearDown(){
        webDriver.quit();
    }

    @Test
    public void checkLine() throws InterruptedException {
       //String resultLinkXpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[9]/div/div/a/div/div";
        String resultLinkXpath = "//div[@class='btn-link-title']";
        By resultMessageBy = By.xpath(resultLinkXpath);
        WebElement errorMessageWebElement = webDriver.findElement(resultMessageBy);

        String actualMessage = errorMessageWebElement.getText();
        String expectedErroMessage = "СВЯЗАТЬСЯ";
        Thread.sleep(3000);

        Assertions.assertEquals(expectedErroMessage, actualMessage);
    }

}
