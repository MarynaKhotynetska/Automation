package com.skillup.automation.pagesByFactory;

import com.skillup.automation.utils.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.skillup.automation.Configuration.UrlsSignUpFactory.SIGNUP_URL;

public class SignUpPageFactory {

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstnameInput;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastnameInput;

    @FindBy(xpath = "//input[@name='emailAddress']")
    private WebElement emailInput;

    @FindBy(xpath = "//li[contains(@class, 'password-field')]//input")
    private WebElement passwordInput;

    @FindBy(xpath = "/*[contains(@class, 'join-btn')]")
    private WebElement joinButton;

    @FindBy(xpath = "")
    private WebElement errorSignUpMessage;

    private WebDriver driver;
    private ElementHelper helper = new ElementHelper();

    public SignUpPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    public SignUpPageFactory open() {
        driver.get(SIGNUP_URL);
        return this;
    }

    public SignUpPageFactory enterFirstName(String name) {
        helper.enterText(firstnameInput, name);
        return this;

    }

    public SignUpPageFactory enterLastName(String LastName) {
        helper.enterText(lastnameInput, LastName);
        return this;


    }

    public SignUpPageFactory enterPassword(String password) {
        helper.enterText(passwordInput, password);
        return this;

    }

    public SignUpPageFactory enterEmail(String email) {
        helper.enterText(emailInput, email);
        return this;

    }

    public SignUpPageFactory clickjoinButton(String join) {
        joinButton.click();
        return this;

    }

    public SignUpPageFactory assertEmailErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = errorSignUpMessage.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Укажите свой адрес эл. почты");
        return this;
    }
}

