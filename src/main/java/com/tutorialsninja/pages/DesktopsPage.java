package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    //verify desktoptext on page
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]" )
    WebElement verifyDesktopText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']" )
    WebElement clickOnZtoA;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']" )
    WebElement clickOnAtoZ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]" )
    WebElement selectHp3065;

    public void clickOnHpLaptop() {
        Reporter.log("click on HP Laptop"+ selectHp3065.toString());
        clickOnElement(selectHp3065);
        CustomListeners.test.log(Status.PASS,"click on Hp Laptop");
    }


    public String verifyText() {
        Reporter.log("verify desktop text"+ verifyDesktopText.toString());
        CustomListeners.test.log(Status.PASS,"verify desktop text");
        return getTextFromElement(verifyDesktopText);
    }

    public void clickonAtoZ() {
        Reporter.log("click on A toZ "+ clickOnAtoZ.toString());
        selectByVisibleTextFromDropDown(clickOnAtoZ, "Name (A - Z)");
        CustomListeners.test.log(Status.PASS,"click on A to Z");
    }

    public void clickonZtoA() {
        Reporter.log("click on Z to A"+ clickOnZtoA.toString());
        //  clickOnElement(clickOnZtoA);
        selectByVisibleTextFromDropDown(clickOnZtoA, "Name (Z - A)");
        CustomListeners.test.log(Status.PASS,"click on z to a");
    }

    //verify z-a order
    @CacheLookup
    @FindBy(xpath = "//h4/a" )
   List< WebElement> allProductName;

    By sortOutZToA = By.id("input-sort");

    public ArrayList<String> verifyProductZToA() {
        // Get all the products name and stored into array list
        List<WebElement> products = allProductName;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order//
        Collections.reverse(originalProductsName);
        //System.out.println(originalProductsName);
        // Select sort by Name Z - A//
        selectByVisibleTextFromDropDown(sortOutZToA, "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = (allProductName);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());

        }
        return afterSortByZToAProductsName;
    }


}
