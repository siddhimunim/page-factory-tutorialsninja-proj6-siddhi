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

public class LaptopAndNoteBookPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifylaptopText;
    @CacheLookup
    @FindBy(xpath="//select[@id='input-sort']")
    WebElement priceHighLowField ;





    public String verifyTextOfLaptop() {
        Reporter.log("verify text Laptop"+ verifylaptopText.toString());

        CustomListeners.test.log(Status.PASS,"verify text Laptop");
        return getTextFromElement(verifylaptopText);
    }

    public void sortProductToHighLow(String text) {
        Reporter.log("sort product high to low - "+text+  priceHighLowField.toString());
        selectByVisibleTextFromDropDown(priceHighLowField, text);
        CustomListeners.test.log(Status.PASS,"sort product high to low - "+text);
    }
    //verify product high to low

    public ArrayList<Double> verifyPriceHighToLow() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }

        return afterSortByPrice;
    }


    // 2.4 Select Product “MacBook”
    @CacheLookup
    @FindBy(linkText="MacBook")
    WebElement selectMacBook;


    public void clickOnMacBook() {
        Reporter.log("click on macbook"+ selectMacBook.toString());
        clickOnElement(selectMacBook);
        CustomListeners.test.log(Status.PASS,"click on macbook");

    }


}
