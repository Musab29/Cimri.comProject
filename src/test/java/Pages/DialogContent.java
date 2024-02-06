package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(css = "div[class='Header_menuItem__iYCDG']  button")
    public WebElement giris;

    @FindBy(css= "div[class='AccountModal_menuListItemContainer__jSFVc'] a")
    public WebElement logingir;

    @FindBy(css = "input[id='email']")
    public WebElement email;

    @FindBy(css = "input[id='password']")
    public WebElement password;
    @FindBy(css = "button[class='sc-iCoGMd juPwmI']")
    public WebElement loginButton;


//    @FindBy(xpath = "(//span[text()='Setup'])[1]")
//    public WebElement setup;

    @FindBy(xpath = "//i[@class='cimri-icon-brochures']")
    public WebElement brochures;

    @FindBy(xpath = "//div[@class='menuCategoryItemTitle'][1]")
    public WebElement elektironik;
    @FindBy(xpath = "//i[@class='cimri-icon-sale-discount-promotion']")
    public WebElement fiyatd;

    @FindBy(xpath = "//div[@class='s1sb4ezy-4 kuQspK']")
    public WebElement kategoriler;





}
