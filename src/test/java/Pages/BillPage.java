package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class BillPage extends Parent {

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[4]/a")
    private WebElement billPayButton;
    @FindBy(css = "[ng-model=\"payee.name\"]")
    private WebElement name;
    @FindBy(css = "[ng-model=\"payee.address.street\"]")
    private WebElement addressButton;
    @FindBy(css = "[ng-model=\"payee.address.city\"]")
    private WebElement cityButton;
    @FindBy(css = "[ng-model=\"payee.address.state\"]")
    private WebElement stateButton;
    @FindBy(css = "[ng-model=\"payee.address.zipCode\"]")
    private WebElement zipCode;
    @FindBy(css = "[ng-model=\"payee.phoneNumber\"]")
    private WebElement phoneNumber;
    @FindBy(css = "[ng-model=\"payee.accountNumber\"]")
    private WebElement accountNumber;
    @FindBy(css = "[ng-model=\"verifyAccount\"]")
    private WebElement verify;
    @FindBy(css = "[ng-model=\"amount\"]")
    private WebElement amount;
    @FindBy(css = "input[value=\"Send Payment\"]")
    private WebElement paymentButton;
    @FindBy(xpath = "//*[@ng-show=\"showResult\"]//h1")
    private WebElement complete;


    WebElement myElement;
    public void findAndClick(String strElement)
    {

        switch (strElement)
        {
            case "billPayButton" : myElement=billPayButton;break;
            case "paymentButton" :myElement=paymentButton;break;

        }
        clickFunction(myElement);
    }
    public void findAndSend(String strElement,String value)
    {


        switch (strElement)
        {
            case "name" : myElement=name;break;
            case "addressButton" :myElement=addressButton;break;
            case "cityButton" : myElement=cityButton;break;
            case "stateButton" :myElement=stateButton;break;
            case "zipCode" : myElement=zipCode;break;
            case "phoneNumber" :myElement=phoneNumber;break;
            case "accountNumber" : myElement=accountNumber;break;
            case "verify" :myElement=verify;break;
            case "amount" : myElement=amount;break;

        }

        sendKeysFunction(myElement,value);
    }
    public void findAndContainsText(String strElement,String text)
    {
        switch (strElement)
        {
            case "complete" : myElement=complete;break;

        }
        verifyContainsText(myElement,text);
    }

}
