package Pages;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent(){

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (linkText = "Register")
    private WebElement registerButton;
    @FindBy (css = "[name=\"username\"]")
    private WebElement username;
    @FindBy (css = "[name=\"password\"]")
    private WebElement password;
    @FindBy(css = "input[value=\"Log In\"]")
     private WebElement logIn;
    @FindBy(xpath = "//*[@ng-if=\"showOverview\"]//h1")
     private WebElement logInCheck;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/h1\n")
     private WebElement errorCheck;
    @FindBy (linkText = "Log Out")
    private WebElement logOutButton;

    WebElement myElement;

    public void findAndClick(String strElement)
    {    //burada string isimden webelemente ulasacagim

        switch (strElement)
        {
            case "registerButton" : myElement=registerButton;break;
            case "logIn" : myElement=logIn;break;
            case "logOutButton" : myElement=logOutButton;break;


        }
        clickFunction(myElement);
    }
    public void findAndSend(String strElement,String value)
    {


        switch (strElement)
        {
            case "username" : myElement=username;break;
            case "password" :myElement=password;break;

        }

        sendKeysFunction(myElement,value);
    }
    public void findAndContainsText(String strElement,String text)
    {
        switch (strElement)
        {
            case "logInCheck" : myElement=logInCheck;break;
            case "errorCheck" : myElement=errorCheck;break;

        }
        verifyContainsText(myElement,text);
    }



}
