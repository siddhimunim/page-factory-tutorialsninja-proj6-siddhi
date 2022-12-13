package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductLP3065Page extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement verifyLaptopText;

    public String verifyLaptopText() {
        Reporter.log("Verify Laptop text" + verifyLaptopText.toString());

        CustomListeners.test.log(Status.PASS, "Verify Laptop text");
        return getTextFromElement(verifyLaptopText);
    }

    //----------------------------------------datepicker------------------------
    //  By calenderField = By.xpath("//div[@class = 'input-group date']//button");
  By monthYearTab = By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]");
    //  By clickOnErrow = By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]");
    By pickDate = By.xpath("//div[@class='datepicker']/div[1]//table//td[text()='30']");


    public void pickUpDate() {
        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthyear = driver.findElement(monthYearTab).getText();
            //nov 2022
            String[] arr = monthyear.split(" ");
            String mon = arr[0];
            String year1 = arr[1];
            if (mon.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]"));
            }

        }
        clickOnElement(By.xpath("//div[@class='datepicker']/div[1]//table//td[text()='30']"));
        List<WebElement> alldates = driver.findElements(pickDate);
        for (WebElement date1 : alldates) {
            if (date1.getText().equalsIgnoreCase(date)) {
                date1.click();
                break;
            }
        }
    }

   

    //click on add to cart//
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    public void clickOnAddToCart() {
        Reporter.log("click on Add to cart" + addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "click on add to cart ");

    }


    //2.7 enterQty //
    @CacheLookup
    @FindBy(name="quantity")
    WebElement enterQtyField;


    public void enterQuantityInToTab(String text) {
        Reporter.log("Quantity enter :"+ text + enterQtyField.toString());
        sendTextToElement(enterQtyField, text);
        CustomListeners.test.log(Status.PASS, "Quantity enter :" + text );

    }

}
