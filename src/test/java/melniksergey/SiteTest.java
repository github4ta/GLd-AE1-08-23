package melniksergey;


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
    public void startBrowser(){

        webDriver = new ChromeDriver();
        webDriver.get("https://taplink.cc/psychologist");

    }

    @AfterEach
    public void stopBrowser(){
        webDriver.quit();
    }

    @Test
    public void checkLine(){
        String resultLinkXpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/div/div/main/div/div[2]/div[2]/div/div/div/div/div/div[9]/div/div/a/div/div";
        By resultMessageBy = By.xpath(resultLinkXpath);
        WebElement errorMessageWebElement = webDriver.findElement(resultMessageBy);
        String actualMessage = errorMessageWebElement.getText();
        String expectedErroMessage = "Связаться";
        System.out.println(actualMessage);

        Assertions.assertEquals(expectedErroMessage, actualMessage);

    }

}
