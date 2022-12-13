package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)

public class RegisterPageTest extends BaseTest {
    HomePage homePage ;
    RegisterAccountPage registerAccountPage ;
    AccountSucessPage accountSucessPage;
    MyAccountPage myAccountPage;
    LogOutAccountPage logOutAccountPage ;
    @BeforeMethod(alwaysRun = true)

    public void objectMethod() {
        homePage = new HomePage();
       registerAccountPage = new RegisterAccountPage();
         accountSucessPage = new AccountSucessPage();
         myAccountPage = new MyAccountPage();
         logOutAccountPage = new LogOutAccountPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnCurrency();
        homePage.selectCurrencyPound();
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        Assert.assertEquals(registerAccountPage.verifyRegAccountText(),"Register Account","Not verify");

    }
    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException{
        Thread.sleep(1000);
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        registerAccountPage.enterFirstName("Jenu");
        registerAccountPage.enterLastName("Thak");
        registerAccountPage.enterEmail("jenuthak");
        registerAccountPage.enterTelephone("025894758");
        registerAccountPage.enterPassword("jenkate123");
        registerAccountPage.enterConfirmPassword("jenkate123");
        Thread.sleep(1000);
        registerAccountPage.clickOnSubscribe();
        registerAccountPage.clickOnCheckbox();
        registerAccountPage.clickOnContinue();
        Thread.sleep(1000);
        Assert.assertEquals(accountSucessPage.verifySucessMassageText(),"Your Account Has Been Created!","Not Verify");
        Thread.sleep(500);
        accountSucessPage.ClickOnContinueTab();
        myAccountPage.clickMyAccountTab();
        homePage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);
        Assert.assertEquals(logOutAccountPage.verifyAccountLogout(),"Account Logout","Not verify");
        logOutAccountPage.clickOnContinueField();

    }


}
