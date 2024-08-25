package by.itacademy.olgazaitseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TerraPizzaPage {
    public WebDriver driver;
    public WebDriverWait wait;

    String expectedProduktName;
    String actualProduktName;

    //Локаторы элементов
    String homePageCookiesCloseButtonPath = "//button[@class='close-icon']";
    String homePageMenuLinkPath = "//li[@class='main-menu__item']//a[@href='https://terrapizza.by/menu']";
    String menuPagePizzaLinkPath = "//a[@class='menu-cats-list-item__info'][@href='/catalog/picca']";
    String pizzaPageMargaritaBasketButtonPath = "//div[@class='cart-button']//button[@data-id='2521']";
    String pageBasketButtonPath = "//div[@class='basket__btn-top basket__top basket__btn-top--sm']";
    String basketPopUpProduktOneNamePath = "//div[@class='basket__products-item-name'][contains(text(), 'Пицца Маргарита')]";
    String basketPopUpProduktTwoNamePath = "//div[@class='basket__products-item-name'][contains(text(), 'Бамбл')]";
    String menuPageBarLinkPath = "//a[@class='menu-cats-list-item__info'][@href='/catalog/bar']";
    String barPageBumbleBasketButtonPath = "//div[@class='cart-button']//button[@data-id='2742']";

    public By homePageCookiesCloseButtonBy = By.xpath(homePageCookiesCloseButtonPath);
    public By homePageMenuLinkBy = By.xpath(homePageMenuLinkPath);
    public By menuPagePizzaLinkBy = By.xpath(menuPagePizzaLinkPath);
    public By pizzaPageMargaritaBasketButtonBy = By.xpath(pizzaPageMargaritaBasketButtonPath);
    public By pageBasketButtonBy = By.xpath(pageBasketButtonPath);
    public By basketPopUpProduktOneNameBy = By.xpath(basketPopUpProduktOneNamePath);
    public By basketPopUpProduktTwoNameBy = By.xpath(basketPopUpProduktTwoNamePath);
    public By menuPageBarLinkBy = By.xpath(menuPageBarLinkPath);
    public By barPageBumbleBasketButtonBy = By.xpath(barPageBumbleBasketButtonPath);

    //Конструктор
    public TerraPizzaPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Методы взаимодействия с элементами
    public void clickHomePageCookiesCloseButton() {
        WebElement homePageCookiesCloseButtonWebElement = wait.until(ExpectedConditions.elementToBeClickable(homePageCookiesCloseButtonBy));
        homePageCookiesCloseButtonWebElement.click();
    }

    public void clickHomePageMenuLink() {
        WebElement homePageMenuLinkWebElement = wait.until(ExpectedConditions.elementToBeClickable(homePageMenuLinkBy));
        homePageMenuLinkWebElement.click();
    }

    public void clickMenuPagePizzaLink() {
        WebElement menuPagePizzaLinkWebElement = wait.until(ExpectedConditions.elementToBeClickable(menuPagePizzaLinkBy));
        menuPagePizzaLinkWebElement.click();

    }

    public void clickPizzaPageMargaritaBasketButton() {
        WebElement pizzaPageMargaritaBasketButtonWebElement = wait.until(ExpectedConditions.elementToBeClickable(pizzaPageMargaritaBasketButtonBy));
        pizzaPageMargaritaBasketButtonWebElement.click();
    }

    public void clickMenuPageBarLink() {
        WebElement menuPageBarLinkWebElement = wait.until(ExpectedConditions.elementToBeClickable(menuPageBarLinkBy));
        menuPageBarLinkWebElement.click();
    }

    public void clickBarPageBumbleBasketButton() {
        WebElement barPageBumbleBasketButtonWebElement = wait.until(ExpectedConditions.elementToBeClickable(barPageBumbleBasketButtonBy));
        barPageBumbleBasketButtonWebElement.click();
    }

    public void clickPageBasketButton() {
        WebElement pageBasketButtonWebElement = wait.until(ExpectedConditions.elementToBeClickable(pageBasketButtonBy));
        pageBasketButtonWebElement.click();
    }

    public void findBasketPopUpProduktOneName() {
        WebElement basketPopUpProduktOneNameWebElement = wait.until(ExpectedConditions.elementToBeClickable(basketPopUpProduktOneNameBy));
        this.actualProduktName = basketPopUpProduktOneNameWebElement.getText().trim();
    }

    public void findBasketPopUpProduktTwoName() {
        WebElement basketPopUpProduktTwoNameWebElement = wait.until(ExpectedConditions.elementToBeClickable(basketPopUpProduktTwoNameBy));
        this.actualProduktName = basketPopUpProduktTwoNameWebElement.getText().trim();
    }

    public void setExpectedProduktName(String expectedProduktName) {
        this.expectedProduktName = expectedProduktName;
    }

    public void setActualProduktName(String actualProduktName) {
        this.actualProduktName = actualProduktName;
    }
}
