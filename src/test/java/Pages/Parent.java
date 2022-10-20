package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);//gozukene kadar bekle
        scrollToElement(element);//elemente scroll yap
        element.clear();//kutucugu temizle
        element.sendKeys(value);// degeri gonder
    }
    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);//click lenebilene kadar bekle
        scrollToElement(element);//elemente scroll yap
        element.click();//tusa clickle
    }

    public void waitUntilVisible(WebElement element)// bekleme metodu olusturduk yukari yazdik
    {
        WebDriverWait wait =new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToElement(WebElement element)// scroll metodu olusturduk yukari yazdik
    {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void waitUntilClickable(WebElement element)// bekleme metodu olusturduk yukari yazdik
    {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element,String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

}
