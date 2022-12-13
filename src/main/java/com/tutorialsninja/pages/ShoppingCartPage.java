package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    //for all methods for desktop----------------------------------------///
    @CacheLookup
  //  @FindBy(xpath = "//body/div[@id='product-product']/div[1]")
     @FindBy(css=  "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")

     WebElement verifyMassage1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")

    WebElement shoppingcart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement VerifyShoppingcart;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductname;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement verifyDelivarydate;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement verifyModel;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotal;

    public String verifyMassageOfShoppingCart1() {
        Reporter.log("“Success: You have added HP LP3065 to your shopping cart!" + verifyMassage1.toString());

        CustomListeners.test.log(Status.PASS, "“Success: You have added HP LP3065 to your shopping cart!");
        return getTextFromElement(verifyMassage1);

    }

    public void clickOnShoppingcart() {
        Reporter.log("click on shopping  cart" + shoppingcart.toString());
        mouseHoverToElementAndClick(shoppingcart);
        CustomListeners.test.log(Status.PASS, "click on shopping cart ");
    }

    public String verifyProductnameText() {
        Reporter.log("Verify product name is : HP LP3065" + verifyProductname.toString());

        CustomListeners.test.log(Status.PASS, "Verify product name is : HP LP3065");
        return getTextFromElement(verifyProductname);

    }

    public String verifyDeliverydateText() {
        Reporter.log(" Delivery Date  : 2022-11-30" + verifyDelivarydate.toString());

        CustomListeners.test.log(Status.PASS, "Delivery Date  : 2022-11-30");
        return getTextFromElement(verifyDelivarydate);

    }

    public String verifyModelNo() {
        Reporter.log("the Model : Product21" + verifyModel.toString());

        CustomListeners.test.log(Status.PASS, "the Model : Product21");
        return getTextFromElement(verifyModel);

    }

    public String verifyShoppingCartText() {
        Reporter.log("Verify ShoppingCart text" + VerifyShoppingcart.toString());

        CustomListeners.test.log(Status.PASS, "Verify Shopping cart text");
        return getTextFromElement(VerifyShoppingcart);

    }

    public String verifyTotal() {
        Reporter.log(" the Todat  £74.73" + verifyTotal.toString());

        CustomListeners.test.log(Status.PASS, " the Todat : £74.73");
        return getTextFromElement(verifyTotal);

    }


  /*  public String verifyMassageOfShoppingCart(){
        Reporter.log("Click on Subscribe" + subscribe.toString());
        CustomListeners.test.log(Status.PASS,"Click on Subscribe " );
      return  getTextFromElement(verifyMassage);

    }
    public void clickOnShoppingcart(){
        mouseHoverToElementAndClick(shoppingcart);
    }
    public String verifyProductnameText (){
        return getTextFromElement(verifyProductname);

    }
    public String verifyDeliverydateText (){
        return getTextFromElement(verifyDelivarydate);

    }
    public String verifyModelNo (){
        return getTextFromElement(verifyModel);

    }
    public String verifyShoppingCartText (){
        return getTextFromElement(VerifyShoppingcart);

    }
    public String verifyTotal (){
        return getTextFromElement(verifyTotal);

    }*/
    //----------------all methods for laptop and notebook--------------------------//
   // 2.9 Verify the text "Shopping Cart"
  @CacheLookup
  @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h1[1]")
  WebElement  verifyShoppingCart;

    public String verifyMassageShoppingcart(){
        Reporter.log(" Text veify Shopping Cart" + verifyShoppingCart.toString());

        CustomListeners.test.log(Status.PASS, " Text veify Shopping Cart");
        return getTextFromElement(verifyShoppingCart);
    }
    //2.10 Verify the Product name "MacBook"
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductMacBook ;

    public String verifyTextOfMacBook(){
        Reporter.log("The Product name :MacBook" + verifyProductMacBook.toString());

        CustomListeners.test.log(Status.PASS, " The Product name :MacBook");
        return getTextFromElement(verifyProductMacBook);
    }
  //2.11 Change Quantity "2"
  @CacheLookup
  @FindBy(xpath = "//div[@class='input-group btn-block']/input")
  WebElement changeQty;

    public void clearQty(String text){
        Reporter.log("clear Quantity and change to " +text + changeQty.toString());
        WebElement changeqty =   driver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
        changeqty.clear();
        sendTextToElement(changeQty,text);
        CustomListeners.test.log(Status.PASS, "clear Quantity and change to " +text);
    }
    //public void newQtychange(String text){
     //  sendTextToElement(changeQty,text);}
   //2.12 Click on “Update” Tab
   @CacheLookup
   @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]")
   WebElement updateButton;

    public void clickOnUpdateButton(){
        Reporter.log("click on Update button" + updateButton.toString());
        clickOnElement(updateButton);
        CustomListeners.test.log(Status.PASS, "click on UpdateButton ");
    }

//2.13 Verify the message “Success: You have modified your shopping cart!”
@CacheLookup
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
WebElement verifySuccessModifyCart;

    public String verifySuceesfullyUpdatecartMassage(){
        Reporter.log("Success: You have modified your shopping cart!" + verifySuccessModifyCart.toString());

        CustomListeners.test.log(Status.PASS, "Success: You have modified your shopping cart!");
        return getTextFromElement(verifySuccessModifyCart);
    }
  //2.14 Verify the Total £737.45
  @CacheLookup
  @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
  WebElement verifyPriceCheck;

    public String verifyPrice(){
        Reporter.log(" The Total  £737.45" + verifyPriceCheck.toString());

        CustomListeners.test.log(Status.PASS, " the Total : £737.45");
        return getTextFromElement(verifyPriceCheck);
    }
 //2.15 Click on “Checkout” button
 @CacheLookup
 @FindBy(linkText="Checkout")
 WebElement checkout;

    public void clickOnCheckOut(){
        Reporter.log("click on checkout " +checkout.toString());
        mouseHoverToElementAndClick(checkout);
        CustomListeners.test.log(Status.PASS, "click on checkout ");
    }
}
