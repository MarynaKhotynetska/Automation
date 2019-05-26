package com.skillup.automation.pagesByFactory;
import com.skillup.automation.utils.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.skillup.automation.pages.LoginPage.LOGIN_URL;


public class LoginPageByFactory {
    @FindBy(xpath = "//input[@id='username']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@class = 'login__form']//button")
    private WebElement loginButton;
    @FindBy(css = "#error-for-password")
    private WebElement errorFormMessage;

    private WebDriver driver;
    private ElementHelper helper = new ElementHelper();

    public LoginPageByFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPageByFactory open() {
        driver.get(LOGIN_URL);
        return this;
    }

    public LoginPageByFactory enterEmail(String email) {
        helper.enterText(emailInput, email);
        return this;
    }

    public LoginPageByFactory enterPassword(String password) {
        helper.enterText(passwordInput, password);
        return this;
    }

    public LoginPageByFactory clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginPageByFactory assertEmailErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = errorFormMessage.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message not match");
        return this;
    }
}
