package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterAccountPage extends Utility {
    //verify register account text
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement regAccountText;


    public String verifyRegAccountText() {
        Reporter.log("Verify Register account text" + regAccountText.toString());
        CustomListeners.test.log(Status.PASS,"Verify Register account text");
        return getTextFromElement(regAccountText);
    }

    // filled mendotary field
    @CacheLookup
    @FindBy(id= "input-firstname")
    WebElement firstName;

    public void enterFirstName(String text) {
        Reporter.log("enter first name " + text + firstName.toString());
        sendTextToElement(firstName, text + getRandomString(1));
        CustomListeners.test.log(Status.PASS,"Enter First name " + text);
    }
    @CacheLookup
    @FindBy(id= "input-lastname")
    WebElement lastName;

    public void enterLastName(String text) {
        Reporter.log("enter last  name " + text + lastName.toString());
        sendTextToElement(lastName, text + getRandomString(1));
        CustomListeners.test.log(Status.PASS,"Enter Last name " + text);
    }
    @CacheLookup
    @FindBy(id= "input-email")
    WebElement email;

    public void enterEmail(String text) {
        Reporter.log("Enter Email " + text + email.toString());
        sendTextToElement(email, text + getRandomString(2) + "@gmail.com");
        CustomListeners.test.log(Status.PASS,"Enter Eamil " + text);
    }
    @CacheLookup
    @FindBy(id= "input-telephone")
    WebElement telephone;

    public void enterTelephone(String text) {
        Reporter.log("enter Telephone :  " + text + telephone.toString());
        sendTextToElement(telephone, text);
        CustomListeners.test.log(Status.PASS,"Enter Telephone " + text);
    }
    @CacheLookup
    @FindBy(id= "input-password")
    WebElement password;

    public void enterPassword(String text) {
        Reporter.log("Enter password : " + text + password.toString());
        sendTextToElement(password, text);
        CustomListeners.test.log(Status.PASS,"Enter password : " + text);
    }
    @CacheLookup
    @FindBy(id= "input-confirm")
    WebElement confirmPass;
    public void enterConfirmPassword(String text) {
        Reporter.log("Enter Confirm Password : " + text + confirmPass.toString());
        sendTextToElement(confirmPass, text);
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password " + text);
    }

    // 3.9 Select Subscribe Yes radio button
    @CacheLookup
    @FindBy(name="newsletter")
    WebElement subscribe;
    public void clickOnSubscribe() {
        Reporter.log("Click on Subscribe" + subscribe.toString());
        clickOnElement(subscribe);
        CustomListeners.test.log(Status.PASS,"Click on Subscribe " );
    }

    //3.10 Click on Privacy Policy check box
    @CacheLookup
    @FindBy(name="agree")
    WebElement checkbox;
    public void clickOnCheckbox() {
        Reporter.log("click on checkbox  " +  checkbox.toString());
        clickOnElement(checkbox);
        CustomListeners.test.log(Status.PASS,"click on checkbox " );
    }

    //3.11 Click on Continue button
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement continueBox ;
    public void clickOnContinue() {
        Reporter.log("click on continue" + continueBox.toString());
        clickOnElement(continueBox);
        CustomListeners.test.log(Status.PASS,"click on continue");
    }

}
