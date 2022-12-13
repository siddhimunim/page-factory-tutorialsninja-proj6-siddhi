package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductMacBookPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement verifyMacBookText ;


    public String verifyMacBookProduct() {
        Reporter.log("verify MacBook text" + verifyMacBookText.toString());
        CustomListeners.test.log(Status.PASS, "verify MacBook text ");
        return getTextFromElement(verifyMacBookText);
    }

    //2.6 Click on ‘Add To Cart’ button
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart1;


    public void clickOnCart() {
        Reporter.log("click on Add to cart" + addToCart1.toString());
        clickOnElement(addToCart1);
        CustomListeners.test.log(Status.PASS, "click on add to cart ");

    }
  //  2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
  @CacheLookup
  @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
  WebElement verifymacBookText;

    public String verifyMacBookTab(){
        Reporter.log("Success: You have added MacBook to your shopping cart!" + verifymacBookText.toString());
        CustomListeners.test.log(Status.PASS, "Success: You have added MacBook to your shopping cart! ");
        return getTextFromElement(verifymacBookText);
    }
    // 2.8 Click on link “shopping cart” display into success message
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shopcart;

    public void clickOnShoppingCart(){
        Reporter.log("click on Shopping cart" + shopcart.toString());
        clickOnElement(shopcart);
        CustomListeners.test.log(Status.PASS, "click on Shopping  cart ");
    }
}
