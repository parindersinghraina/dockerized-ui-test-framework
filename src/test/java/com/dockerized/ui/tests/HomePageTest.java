package com.dockerized.ui.tests;

import com.dockerized.ui.helper.WaitHelper;
import com.dockerized.ui.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseUiTest {

    @Test(description = "Test Homepage")
    public void testHomePage0() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
        Assert.assertTrue(homePage.categoriesTitleIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage1()  {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage2() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage3() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage4() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage5() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage6() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage7() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }

    @Test(description = "Test Homepage")
    public void testHomePage8() {
        HomePage homePage = new HomePage(this.getDriver(), this.config);
        homePage.get();
        homePage.waitForPageLoad();


        // ASSERTION
        Assert.assertTrue(homePage.demoBlazeLogoIsVisible());
    }
}
