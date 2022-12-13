package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LogOutAccountPage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage ;
    LoginPage loginPage ;
    MyAccountPage myAccountPage ;
    LogOutAccountPage logOutAccountPage ;
    @BeforeMethod(alwaysRun = true)

    public void objectMethod() {
      homePage = new HomePage();
       loginPage = new LoginPage();
       myAccountPage = new MyAccountPage();
       logOutAccountPage = new LogOutAccountPage();

    }

     @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully()throws InterruptedException{
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        Thread.sleep(500);
        Assert.assertEquals(loginPage.verifyReturningCustomer(),"Returning Customer", "Not verify");
    }
    @Test (groups = {"smoke", "regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully () throws InterruptedException{
        Thread.sleep(1000);
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        loginPage.enterEmailField("jenuthakee@gmail.com");
        loginPage.enterPasswordField("jenkate123");
        loginPage.clickOnLoginField();
        Thread.sleep(1000);
        Assert.assertEquals(myAccountPage.verifyMyAccount(),"My Account","Not verify");
        myAccountPage.clickMyAccountTab();
        homePage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);
       Assert.assertEquals(logOutAccountPage.verifyAccountLogout(),"Account Logout","Not verify");
        logOutAccountPage.clickOnContinueField();



    }
}
