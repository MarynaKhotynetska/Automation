package com.skillup.automation.pages;
import com.skillup.automation.Configuration.Wait;
import com.skillup.automation.utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class LoginPage extends CommonPage {
    private static final String EMAIL_OR_PHONE_INPUT_XPATH_LOCATOR = "//input[@id='username']";
    private static final String PASSWORD_INPUT_XPATH_LOCATOR = "//input[@id='password']";
    private static final String PASSWORD_TOGGLE_XPATH_LOCATOR = "//span[@id='password-visibility-toggle']";
    private static final String SIGN_IN_BUTTON_XPATH_LOCATOR = "//*[@class = 'login__form']//button";
    private static final String FORGOT_PASSWORD_LINK_XPATH_LOCATOR = "//a[contains(@href, 'request-password-reset')]";
    private static final String JOIN_NOW_LINK_XPATH_LOCATOR = "//a[@href ='/start/join']";
    private static final String ERROR_PASSWORD_DIV_CSS_LOCATOR = "#error-for-password";

    public static final String LOGIN_URL = "https://www.linkedin.com/uas/login";

    // private WebDriver driver;
    private ElementHelper elementHelper = new ElementHelper();

    // public LoginPage(WebDriver driver) {
    //this.driver = driver;
    //}

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public LoginPage open() {
        driver.get(LOGIN_URL);
        return this;
    }

    public LoginPage waitPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Wait.TEN_SECONDS);
        wait.pollingEvery(Duration.ofMillis(1000));
        wait.until(presenceOfElementLocated(find(SIGN_IN_BUTTON_XPATH_LOCATOR)));                  //wait

        return this;
    }


    public void open(String url) {
        driver.get(url);
    }

    public LoginPage enterEmail(String email) {

        enterText(EMAIL_OR_PHONE_INPUT_XPATH_LOCATOR, email);
        return this;
    }

//    public void enterEmail(String email) {
//        WebElement input = driver.findElement(By.xpath(EMAIL_OR_PHONE_INPUT_XPATH_LOCATOR));
//        elementHelper.enterText(input, email);
//    }

    public LoginPage enterPassword(String password) {
        WebElement input = driver.findElement(By.xpath(PASSWORD_INPUT_XPATH_LOCATOR));
        elementHelper.enterText(input, password);
        return this;
    }

    public LoginPage clickLoginButton() {
        click(SIGN_IN_BUTTON_XPATH_LOCATOR);
        return this;
    }

    public LoginPage assertEmailErrorMessage(String expectedErrorMessage) {
        WebElement errorMessage = driver.findElement(By.cssSelector(LoginPage.ERROR_PASSWORD_DIV_CSS_LOCATOR));
        String actualErrorMessage = errorMessage.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message not match");
        return this;
    }

    public String getEmailErrorMessage() {
        WebElement errorMessage = driver.findElement(By.cssSelector(LoginPage.ERROR_PASSWORD_DIV_CSS_LOCATOR));
        return errorMessage.getText();
    }
}


