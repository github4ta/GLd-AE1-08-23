package by.sergeymelnik.mirtechno;

import by.sergeymelnik.mirtechno.packages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class TestClass extends BaseClass{


    @Test
    public void footerCheckNameTest(){
        HomePage homePage = new HomePage(driver);
        String actual = homePage.getMainPageStringFooter();
       // String actual = driver.findElement(By.xpath(HomePage.MAIN_PAGE_STRING_FOOTER)).getText();
         Assertions.assertEquals(HomePage.MAIN_PAGE_STRING_FOOTER_CHECK, actual);
    }

    @Test
    public void scrollMirTechnoTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        String actual = homePage.getMainPageStringFooterScroll();
//        WebElement footerWebElement = driver.findElement(By.xpath(HomePage.MAIN_PAGE_STRING_FOOTER));
//        int delay = 100;
//        new Actions(driver)
//                .scrollToElement(footerWebElement)
//                .scrollByAmount(0, delay)
//                .perform();
//        Thread.sleep(3000);
        Assertions.assertEquals(HomePage.MAIN_PAGE_STRING_FOOTER_CHECK, actual);
//        new Actions(driver)
//                .scrollByAmount(0, delay)
//                .perform();

    }




}
