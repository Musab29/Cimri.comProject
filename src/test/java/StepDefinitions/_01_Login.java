package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_Login {


    DialogContent dc = new DialogContent();
    @Given("Navigate to Cımrı")
    public void navigateToCımrı() throws InterruptedException {
        GWD.getDriver().get("https://www.cimri.com/");
        dc.giris.click();
        Thread.sleep(1000);
        dc.logingir.click();

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        dc.email.sendKeys("eyp.mermer2007@gmail.com");
        dc.password.sendKeys("Musab2934");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() throws InterruptedException {
        dc.loginButton.click();
        Thread.sleep(1000);


    }



}


