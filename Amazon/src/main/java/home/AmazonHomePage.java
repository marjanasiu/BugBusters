package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AmazonHomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[1]")
    public static WebElement todaysDealsWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement helpWebElement;

    @FindBy(how = How.XPATH, using = "//a[text()='Registry']")
    public static WebElement registryWebElement;

    @FindBy(how = How.CSS, using = "//a[text()='Gift Cards']")
    public static WebElement giftCardslsWebElement;

    @FindBy(how = How.CSS, using = "//a[text()='Sell']")
    public static WebElement sellWebElement;

    @FindBy(how = How.ID, using = "a[id='nav-your-amazon']")
    public static WebElement yourAmazonComlsWebElement;

    @FindBy(how = How.XPATH, using = "//span[text()='Hello, Sign in']")
    public static WebElement helloSignInWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-orders\"]/span[1]")
    public static WebElement returnAndOrdersWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-cart\"]/span[1]")
    public static WebElement cartWebElement;

    @FindBy(xpath = "//b[text()='Deals and Promotions']")
    public WebElement dealsAndPromotionsText;

    @FindBy(xpath = "//h1[contains(text(),'Hello. What can we help you with?')]")
    public WebElement helpText;

    @FindBy(xpath = "//a[text()='Amazon Music']")
    public static WebElement music;

    @FindBy(xpath = "//*[@id=\"contentGrid_336610\"]/div/div[1]/div/div/div/img")
    public WebElement registerWithAmazonPic;

    @FindBy(xpath = "//*[@id=\"contentGrid_981757\"]/div/div/div/div/div/img")
    public WebElement giftCardsPic;

    @FindBy(xpath = "//*[@id=\"eventColor\"]/div[3]/div/div/div[1]/div/div[1]/div[3]/div/div/a")
    public WebElement startSellingPic;

    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")
    public WebElement signInText;

    @FindBy(xpath = "//*[@id=\"sc-active-cart\"]/div/h1[1]")
    public WebElement yourShoppingCartIsEmptyText;

    @FindBy(xpath = "//*[@id=\"amazonMusicLogo\"]")
    public WebElement amazonMusicLogo;


    public static WebElement getMusic() {
        return music;
    }

    public static WebElement getTodaysDealsWebElement() {
        return todaysDealsWebElement;
    }

    public static WebElement getHelpWebElement() {
        return helpWebElement;
    }

    public static WebElement getRegistryWebElement() {
        return registryWebElement;
    }

    public static WebElement getGiftCardsWebElement() {
        return giftCardslsWebElement;
    }

    public static WebElement getSellWebElement() {
        return sellWebElement;
    }

    public static WebElement getYourAmazonComWebElement() {
        return yourAmazonComlsWebElement;
    }

    public static WebElement getHelloSignInWebElementWebElement() {
        return helloSignInWebElement;
    }

    public static WebElement getReturnAndOrdersWebElement() {
        return returnAndOrdersWebElement;
    }

    public static WebElement getCartWebElement() {
        return cartWebElement;
    }

    public WebElement getHelpText() {
        return helpText;
    }

    public WebElement getRegisterWithAmazonPic() {
        return registerWithAmazonPic;
    }

    public boolean checkIfGetHelpText() {
        return getHelpText().isDisplayed();
    }

    public void clickOnTodaysDealsTab() {
        getTodaysDealsWebElement().click();
    }

    public void clickOnHelpTab() {
        getHelpWebElement().click();
    }

    public void clickOnRegistryTab() {
        getRegistryWebElement().click();
    }

    public void clickOnGiftCardsTab() {
        getGiftCardsWebElement().click();
    }

    public void clickOnSellTab() {
        getSellWebElement().click();
    }

    public void clickOnYourAmazonComTab() {
        getYourAmazonComWebElement().click();
    }

    public void clickOnHelloSignInTab() {
        getHelloSignInWebElementWebElement().click();
    }

    public void clickOnReturnsAndOrderTab() {
        getReturnAndOrdersWebElement().click();
    }

    public void clickOnCartTab() {
        getCartWebElement().click();
    }

    public void clickMusic() {
        getMusic().click();
    }

    public boolean checkIfregisterWithAmazonPic() {
       return getRegisterWithAmazonPic().isDisplayed();
    }

}
