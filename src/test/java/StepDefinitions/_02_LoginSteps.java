package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class _02_LoginSteps {
    DialogContent dc=new DialogContent();

    @When("Login with name as {string} short name as {string}")
    public void loginWithNameAsShortNameAs(String name, String password) {

        dc.findAndSend("username",name);
        dc.findAndSend("password",password);
        dc.findAndClick("logIn");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        if (GWD.getDriver().getCurrentUrl().contains("overview")){
            dc.findAndContainsText("logInCheck", "Accounts Overview");
        }
        else
            if (GWD.getDriver().getCurrentUrl().contains("login")){
                dc.findAndContainsText("errorCheck","Error");
            }

    }



}
