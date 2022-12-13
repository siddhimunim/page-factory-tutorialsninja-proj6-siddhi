package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
    //click on my account and logout
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    public void clickMyAccountTab() {
        Reporter.log("click on My account" + myAccount.toString());
        mouseHoverToElementAndClick(myAccount);
        CustomListeners.test.log(Status.PASS, "click on myAccount");

    }

    //verify My Account
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement verifyMyAcc;

    public String verifyMyAccount() {
        Reporter.log("Verify My account text" + verifyMyAcc.toString());

        CustomListeners.test.log(Status.PASS, "Verify My account text");
        return getTextFromElement(verifyMyAcc);
    }

}
