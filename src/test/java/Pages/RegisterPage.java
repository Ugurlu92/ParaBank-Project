package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Parent{
    public RegisterPage(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "customer.firstName")
    private WebElement firstName;
    @FindBy(id = "customer.lastName")
    private WebElement lastName;
    @FindBy(id = "customer.address.street")
    private WebElement addressLine;
    @FindBy(id = "customer.address.city")
    private WebElement cityLine;
    @FindBy(id = "customer.address.state")
    private WebElement stateLine;
    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;
    @FindBy(id = "customer.ssn")
    private WebElement ssn;
    @FindBy(id = "customer.username")
    private WebElement userName;
    @FindBy(id = "customer.password")
    private WebElement password;
    @FindBy(id = "repeatedPassword")
    private WebElement repeatedPassword;
    @FindBy(xpath = "//*[@id='rightPanel']//p")
    private WebElement confirm;
    @FindBy(css = "input[class=\"button\"]")
    private WebElement register;



    WebElement myElement;
    public void findAndClick(String strElement)
    {

        switch (strElement)
        {
            case "register" : myElement=register;break;

        }
        clickFunction(myElement);
    }
    public void findAndSend(String strElement,String value)
    { //burada string isimden webelemente ulasacagim


        switch (strElement)
        {
            case "firstName" : myElement=firstName;break;
            case "lastName" :myElement=lastName;break;
            case "addressLine" :myElement=addressLine;break;
            case "cityLine" :myElement=cityLine;break;
            case "stateLine" : myElement=stateLine;break;
            case "zipCode" : myElement=zipCode;break;
            case "phoneNumber" : myElement=phoneNumber;break;
            case "ssn" : myElement=ssn;break;
            case "userName" : myElement=userName;break;
            case "password" : myElement=password;break;
            case "repeatedPassword" : myElement=repeatedPassword;break;


        }

        sendKeysFunction(myElement,value);
    }
    public void findAndContainsText(String strElement,String text)
    {

        switch (strElement)
        {
            case "confirm" : myElement=confirm;break;

        }
        verifyContainsText(myElement,text);
    }
}
