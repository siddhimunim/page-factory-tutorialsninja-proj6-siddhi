package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {


    //for desktop tab
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> menuField;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsField;
    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement allDesktopField;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNoteBookField;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsField;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Currency')]")
    WebElement currencyField;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'£ Pound Sterling')]")
    WebElement SelectPound;



    //method for homepage
    public void clickOnAllDesktop() {
        Reporter.log("click on All desktop tab"+ allDesktopField.toString());
        clickOnElement(allDesktopField);
        CustomListeners.test.log(Status.PASS,"click on all Desktop tab");

    }

    public void mouseHoverOnlaptopAndNoteBook() {
        Reporter.log("click on laptop and notebook"+ laptopAndNoteBookField.toString());
        mouseHoverToElementAndClick(laptopAndNoteBookField);
        CustomListeners.test.log(Status.PASS,"click on laptop and notebook");
    }

    public void mouseHoverOnDesktop() {
        Reporter.log("click on desktop tab"+ desktopsField.toString());
        mouseHoverToElementAndClick(desktopsField);
        CustomListeners.test.log(Status.PASS,"click on  Desktop tab");
    }

    public void mouseHoverOnComponents() {
        Reporter.log("click on Components"+ componentsField.toString());
        mouseHoverToElementAndClick(componentsField);
        CustomListeners.test.log(Status.PASS,"click on Components");
    }

    public void selectmenu(String menu) {
        Reporter.log("click on All desktop tab"+ allDesktopField.toString());
        List<WebElement> topMenuList = (menuField);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (
                StaleElementReferenceException e) {
            topMenuList = (menuField);
        }
    }

    public void clickOnCurrency() {
        Reporter.log("click on currency"+ currencyField.toString());
        mouseHoverToElementAndClick(currencyField);
        CustomListeners.test.log(Status.PASS,"click on currency");

    }

    public void selectCurrencyPound() {
        Reporter.log("Select currency pound "+ SelectPound.toString());
        clickOnElement(SelectPound);
        CustomListeners.test.log(Status.PASS,"Select currency pound ");

    }

    //---------------------------------method for select my account tabs-------------------------------//
    By myAccountList1 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");

    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = driver.findElements(myAccountList1);
        try {
            for (WebElement option1 : myAccountList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(option)) {
                    option1.click();
                    break;
                }

            }

        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(myAccountList1);
        }
    }

    //click on my account
    By myAccountButton = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccount() {
        mouseHoverToElementAndClick(myAccountButton);
    }


}
