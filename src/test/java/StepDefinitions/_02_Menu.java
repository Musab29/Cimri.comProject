package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Menu {
    DialogContent dc = new DialogContent();

    @And("click on brochures")
    public void clickOnBrochures() throws InterruptedException {
        GWD.getDriver().get("https://www.cimri.com/?gad_source=1&gclid=CjwKCAiAq4KuBhA6EiwArMAw1CNuqmS7pu9lBt1gbwO9DmEQSqlOrhesImoESvzrM2q7nq6c8gRzAhoCljIQAvD_BwE&gclsrc=aw.ds");
        Thread.sleep(1000);
        dc.brochures.click();
        dc.fiyatd.click();

    }
}
