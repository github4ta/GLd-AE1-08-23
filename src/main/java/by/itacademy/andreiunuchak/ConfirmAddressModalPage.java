package by.itacademy.andreiunuchak;

import by.onliner.Waiters;
import org.openqa.selenium.By;

public class ConfirmAddressModalPage extends BasePage {

    public ConfirmAddressModalPage() {
        super();
    }

    private final String inputAddressStreetXpath = "//input[@id='street']";
    private final By inputAddressStreetBy = By.xpath(inputAddressStreetXpath);

    private final String inputAddressHouseXpath = "//input[@id='house']";
    private final By inputAddressHouseBy = By.xpath(inputAddressHouseXpath);

    private final String buttonConfirmXpath = "//div[@role='dialog']//button[@class='button']";
    private final By buttonConfirmBy = By.xpath(buttonConfirmXpath);

    public void inputAddressStreet(String streetName) {
        Waiters.waitFor(1);
        driver.findElement(inputAddressStreetBy).sendKeys(streetName);
    }

    public void inputAddressHouse(int houseNumber) {
        Waiters.waitFor(1);
        driver.findElement(inputAddressHouseBy).sendKeys(String.valueOf(houseNumber));
    }

    public void clickButtonConfirm() {
        Waiters.waitFor(1);
        driver.findElement(buttonConfirmBy).click();
    }
}
