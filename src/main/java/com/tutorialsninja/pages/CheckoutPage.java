package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {
    //2.16 Verify the text “Checkout”
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement verifyCheckoutText;

    public String verifycheckoutTextOnPage() {
        Reporter.log("verify checkout text on page" + verifyCheckoutText.toString());
        CustomListeners.test.log(Status.PASS, "verify checkout text");
        return getTextFromElement(verifyCheckoutText);
    }

    //2.17 Verify the Text “New Customer”
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement verifyNewCustomerText;


    public String verifyNewCustomerTab() {
        Reporter.log("verify New customer text" + verifyNewCustomerText.toString());
        CustomListeners.test.log(Status.PASS, "verify New customer text");
        return getTextFromElement(verifyNewCustomerText);
    }

    // 2.18 Click on “Guest Checkout” radio button
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckout;

    public void clickOnGuestCheckout() {
        Reporter.log("click on guest checkout" + guestCheckout.toString());
        clickOnElement(guestCheckout);
        CustomListeners.test.log(Status.PASS, "click on guest checkout");
    }

    //2.19 Click on “Continue” tab
    @CacheLookup
    @FindBy(id = "button-account")
    WebElement Continue;

    public void clickOnContinueTab() {
        Reporter.log("click on continue" + Continue.toString());
        clickOnElement(Continue);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }

    //fill all field  of guestcheckout form------------------
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstname;

    public void enterFirstname(String text) {
        Reporter.log("First name " + text + firstname.toString());
        sendTextToElement(firstname, text);
        CustomListeners.test.log(Status.PASS, "First name is " + text);
    }

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastname;

    public void enterLastname(String text) {
        Reporter.log("Last name " + text + lastname.toString());
        sendTextToElement(lastname, text);
        CustomListeners.test.log(Status.PASS, "Last name is " + text);
    }

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement email;

    public void enterEmail(String text) {
        Reporter.log("Email " + text + email.toString());
        sendTextToElement(email, text);
        CustomListeners.test.log(Status.PASS, " Email is " + text);
    }

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephoneField;

    public void enterTelephone(String text) {
        Reporter.log("Telephone no is " + text + telephoneField.toString());
        sendTextToElement(telephoneField, text);
        CustomListeners.test.log(Status.PASS, "Telephone no is " + text);
    }

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address1;

    public void enterAddress1(String text) {
        Reporter.log("Address is " + text + address1.toString());
        sendTextToElement(address1, text);
        CustomListeners.test.log(Status.PASS, "Address is " + text);
    }

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;

    public void enterCityName(String text) {
        Reporter.log("City name is " + text + city.toString());
        sendTextToElement(city, text);
        CustomListeners.test.log(Status.PASS, "City name is " + text);
    }

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;

    public void enterPostcode(String text) {
        Reporter.log("Postcode is  " + text + postcode.toString());
        sendTextToElement(postcode, text);
        CustomListeners.test.log(Status.PASS, "postcode is " + text);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement Country;


    public void enterCountryName(String text) {
        Reporter.log("Country name " + text + Country.toString());
        selectByVisibleTextFromDropDown(Country, text);
        CustomListeners.test.log(Status.PASS, "Country name is " + text);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    public void enterRegionField(String text) {
        Reporter.log("Region is " + text + region.toString());
        selectByVisibleTextFromDropDown(region, text);
        CustomListeners.test.log(Status.PASS, "Region name is " + text);
    }

    //click on countinue
    @CacheLookup
    @FindBy(id= "button-guest")
    WebElement continueField;
    public void clickOnContinue() {
        Reporter.log("click on continue" + continueField.toString());
        clickOnElement(continueField);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }

    //2.22 Add Comments About your order into text area
    @CacheLookup
    @FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]")
    WebElement comment;


    public void addCommentOnTextArea(String text) {
        Reporter.log(text + comment.toString());
        sendTextToElement(comment, text);
        CustomListeners.test.log(Status.PASS, "comments is"+ text);
    }

    //2.23 Check the Terms & Conditions check box
    @CacheLookup
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement termsCondition;


    public void clickOnTermsAndCondition() {
        Reporter.log("clickOnTermsAndCondition" + termsCondition.toString());
        clickOnElement(termsCondition);
        CustomListeners.test.log(Status.PASS, "clickOnTermsAndCondition");
    }

    //2.24 Click on “Continue” button
    @CacheLookup
    @FindBy(id= "button-payment-method")
    WebElement contTab;

    public void clickOnContinueField() {
        Reporter.log("click on continue" + contTab.toString());
        clickOnElement(contTab);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }

    //2.25 Verify the message “Warning: Payment method required
    @CacheLookup
    @FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")
    WebElement verifyWarningMassage;


    public String verifyWarningSign() {
        Reporter.log("“Warning: Payment method required " + verifyWarningMassage.toString());
        CustomListeners.test.log(Status.PASS, "“Warning: Payment method required");
        return getTextFromElement(verifyWarningMassage);
    }


}
