package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {
    HomePage homepage ;
    DesktopsPage desktopsPage;
    LaptopAndNoteBookPage laptopAndNoteBookPage ;
    ComponentsPage componentsPage ;

    @BeforeMethod(alwaysRun = true)

    public void objectMethod() {
         homepage = new HomePage();
        desktopsPage = new DesktopsPage();
         laptopAndNoteBookPage = new LaptopAndNoteBookPage();
         componentsPage = new ComponentsPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException{
        homepage.mouseHoverOnDesktop();
        homepage.selectmenu("Show All Desktops");
        String expText ="Desktops";
        String actText = desktopsPage.verifyText();
        Thread.sleep(500);
        Assert.assertEquals(actText,expText,"Not varify ");
    }

   @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()throws InterruptedException{
       homepage.mouseHoverOnlaptopAndNoteBook();
       homepage.selectmenu("Show All Laptops & Notebooks");
       Thread.sleep(500);
       String expText ="Laptops & Notebooks";
       String actText = laptopAndNoteBookPage.verifyTextOfLaptop();
       Assert.assertEquals(actText,expText,"Not varify ");


   }
   @Test(groups = { "regression"})
   public void verifyUserShouldNavigateToComponentsPageSuccessfully()throws InterruptedException{
       homepage.mouseHoverOnComponents();
       homepage.selectmenu("Show All Components");
       Thread.sleep(500);
       String expText ="Components";
       String actText = componentsPage.verifyTextOfComponents();
       Assert.assertEquals(actText,expText,"Not varify ");

   }

}
