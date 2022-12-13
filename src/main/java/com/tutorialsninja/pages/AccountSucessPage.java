package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountSucessPage extends Utility {
    // 3.12 Verify the message “Your Account Has Been Created!”
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]" )
    WebElement verifySucessMassage;

    public String verifySucessMassageText(){
        Reporter.log("Your Account Has Been Created!"+ verifySucessMassage.toString());
        CustomListeners.test.log(Status.PASS,"Your Account Has Been Created!");
        return getTextFromElement(verifySucessMassage);

    }
   // 3.13 Click on Continue button
   @CacheLookup
   @FindBy(linkText ="Continue" )
   WebElement clickOn;

    public void ClickOnContinueTab(){
        Reporter.log("click on countinue tab"+ clickOn.toString());
        clickOnElement(clickOn);
        CustomListeners.test.log(Status.PASS,"click on countinue tab");
    }
}
