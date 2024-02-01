package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class _02_Menu {
    DialogContent dc = new DialogContent();


    @And("click on brochures")
    public void clickOnBrochures() {
        dc.brochures.click();
    }
}
