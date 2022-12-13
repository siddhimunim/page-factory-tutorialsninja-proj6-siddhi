package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]" )
    WebElement verifyComponentText;


    public String  verifyTextOfComponents() {
        Reporter.log("verify text components"+ verifyComponentText.toString());
        CustomListeners.test.log(Status.PASS,"verify text components");
        return getTextFromElement(verifyComponentText);
    }
}
