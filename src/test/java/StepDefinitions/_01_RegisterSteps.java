package StepDefinitions;

import Pages.DialogContent;
import Pages.RegisterPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {

    DialogContent dc=new DialogContent();
    RegisterPage rp=new RegisterPage();
    @Given("Navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click on register button and fill the form")
    public void clickOnRegisterButtonAndFillTheForm() {
        dc.findAndClick("registerButton");
        rp.findAndSend("firstName","Hakan");
        rp.findAndSend("lastName","Kadir");
        rp.findAndSend("addressLine","kartal");
        rp.findAndSend("cityLine","Istanbul");
        rp.findAndSend("stateLine","Turkiye");
        rp.findAndSend("zipCode","20001");
        rp.findAndSend("phoneNumber","5389282928");
        rp.findAndSend("ssn","123456");
        rp.findAndSend("userName","Hakan111");
        rp.findAndSend("password","Hakan111");
        rp.findAndSend("repeatedPassword","Hakan111");


    }

    @Then("User should be registered successfully")
    public void userShouldBeRegisteredSuccessfully() {

    }
}
