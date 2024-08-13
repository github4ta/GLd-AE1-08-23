package by.onliner.homepage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TestSt003 extends BaseTest {

    @Test
    public void testSectionAutobaraholka(){
        String topMenuXpath = "//ul[@class='b-main-navigation']";
        By topMenuBy = By.xpath(topMenuXpath);
        WebElement topMenuWebElement = driver.findElement(topMenuBy);
        String menuOptionXpath = "//li[contains(@class,'b-main-navigation__item')]";
        By menuOptionBy = By.xpath(menuOptionXpath);
        List<WebElement> menuOptionWebElements = topMenuWebElement.findElements(menuOptionBy);

        // Find the "Автобарахолка" button (update the index if necessary based on the actual page structure)
        WebElement buttonAutobaraholkaWebElement = null;
        for (WebElement element : menuOptionWebElements) {
            if (element.getText().contains("Автобарахолка")) {
                buttonAutobaraholkaWebElement = element;
                break;
            }
        }

        if (buttonAutobaraholkaWebElement != null) {
            buttonAutobaraholkaWebElement.click();
        } else {
            Assertions.fail("Could not find the 'Автобарахолка' button.");
        }

        String expectedAutobaraholkaURL = "https://ab.onliner.by/";
        String actualAutobaraholkaURL = driver.getCurrentUrl();

        Assertions.assertEquals(expectedAutobaraholkaURL, actualAutobaraholkaURL);
    }
}
