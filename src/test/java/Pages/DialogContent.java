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
    @FindBy(css = "span[class='sc-eCApnc iylGhi']")
    public WebElement loginButton;


//    @FindBy(xpath = "(//span[text()='Setup'])[1]")
//    public WebElement setup;

    @FindBy(css = "div[class='Header_headerWrapper__iwyXB']  button")
    public WebElement brochures;


}
