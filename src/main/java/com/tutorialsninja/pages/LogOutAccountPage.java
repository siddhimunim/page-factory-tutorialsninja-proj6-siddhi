package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LogOutAccountPage extends Utility {
    // 3.16 Verify the text “Account Logout”
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Account Logout')]")
    WebElement logOut;

    public String verifyAccountLogout() {
        Reporter.log("verifying account logout text" + logOut.toString());
        CustomListeners.test.log(Status.PASS,"verifying account logout text");
        return getTextFromElement(logOut);
    }

    // 3.17 Click on Continue button
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement fieldContinue;


    public void clickOnContinueField() {
        Reporter.log("click on continue" + fieldContinue.toString());
        clickOnElement(fieldContinue);
        CustomListeners.test.log(Status.PASS,"click on continue");

    }


}
