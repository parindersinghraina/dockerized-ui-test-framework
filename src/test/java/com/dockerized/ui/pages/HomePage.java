package com.dockerized.ui.pages;

import com.dockerized.ui.configuration.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, Config config) {
        super(driver, config);
        this.url = this.config.getProperty("ui.demoblaze.baseurl");
    }

    public void waitForPageLoad() {
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeLogo));
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeTitle));
    }

    @FindBy(xpath = "//body/nav[@id='narvbarx']/a[@id='nava']/img[1]")
    WebElement demoBlazeLogo;

    public boolean demoBlazeLogoIsVisible() {
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeLogo));
        return this.demoBlazeLogo.isDisplayed();
    }

    @FindBy(xpath = "//a[@id='nava']")
    WebElement demoBlazeTitle;

    public boolean demoBlazeTitleIsVisible() {
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeTitle));
        return this.demoBlazeTitle.isDisplayed();
    }

    @FindBy(xpath = "//div[@id='navbarExample']/ul[1]/li[1]/a[1]")
    WebElement homeLink;

    public void clickHomeLink() {
        this.wait.until(ExpectedConditions.visibilityOf(this.homeLink));
        this.homeLink.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    WebElement contactLink;

    public void clickContactLink() {
        this.wait.until(ExpectedConditions.visibilityOf(this.contactLink));
        this.contactLink.click();
    }

    @FindBy(xpath = "//a[contains(text(),'About us')]")
    WebElement aboutUsLink;

    public void clickAboutUsLink() {
        this.wait.until(ExpectedConditions.visibilityOf(this.aboutUsLink));
        this.aboutUsLink.click();
    }

    @FindBy(xpath = "//a[@id='cartur']")
    WebElement cartLink;

    public void clickCartLink() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cartLink));
        this.cartLink.click();
    }

    @FindBy(xpath = "//a[@id='login2']")
    WebElement logInLink;

    public void clickLogInLink() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cartLink));
        this.cartLink.click();
    }

    @FindBy(xpath = "//a[@id='signin2']")
    WebElement signUpLink;

    public void clickSignUpLink() {
        this.wait.until(ExpectedConditions.visibilityOf(this.cartLink));
        this.cartLink.click();
    }

    @FindBy(xpath = "//div[@id='carouselExampleIndicators']/div[1]")
    WebElement demoBlazeSlider;

    public boolean demoBlazeSliderIsVisible() {
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeSlider));
        return this.demoBlazeSlider.isDisplayed();
    }

    // CATEGORIES
    @FindBy(xpath = "//a[@id='cat']")
    WebElement categoriesTitle;

    public boolean categoriesTitleIsVisible() {
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeSlider));
        return this.categoriesTitle.isDisplayed();
    }

    public void clickCategoryByName(String categoryName) {
        this.wait.until(ExpectedConditions.visibilityOf(this.demoBlazeSlider));
        this.categoriesTitle.findElement(By.xpath("//a[contains(text(),'"+categoryName+"')]")).click();
    }
}
