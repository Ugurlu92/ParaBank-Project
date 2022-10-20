package StepDefinitions;

import Pages.BillPage;
import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPayStep {
    DialogContent dc=new DialogContent();
    BillPage bp=new BillPage();
    @When("Login with real username")
    public void loginWithRealUsername() {
        dc.findAndSend("username","oguzhan111");
        dc.findAndSend("password","oguzhan111");
        dc.findAndClick("logIn");

    }

    @Then("Success messages should be displayed")
    public void successMessagesShouldBeDisplayed() {
        dc.findAndContainsText("logInCheck", "Accounts Overview");

    }

    @When("Click on BillPay Button")
    public void clickOnBillPayButton() {
        bp.findAndClick("billPayButton");
    }

    @Then("Fill the forms name as {string} and short name as {string}click the payment button")
    public void fillTheFormsNameAsAndShortNameAsClickThePaymentButton(String name, String value) {

        bp.findAndSend("name",name);
        bp.findAndSend("addressButton","kartal");
        bp.findAndSend("cityButton","istanbul");
        bp.findAndSend("stateButton","turkiye");
        bp.findAndSend("zipCode","12345");
        bp.findAndSend("phoneNumber","123123151");
        bp.findAndSend("accountNumber","1234");
        bp.findAndSend("verify","1234");
        bp.findAndSend("amount",value);
        bp.findAndClick("paymentButton");
    }

    @And("Check payments status")
    public void checkPaymentsStatus() {
        bp.findAndContainsText("complete","complete");
    }
}
