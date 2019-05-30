package com.skillup.automation.pages;
//page object

import com.skillup.automation.LocatorsClass;
import com.skillup.automation.utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    public static final String FIRST_NAME_INPUT_XPATH_LOCATOR = "//input[@id='first-name']";
    public static final String LAST_NAME_INPUT_XPATH_LOCATOR = "//input[@id='last-name']";
    public static final String EMAIL_INPUT_XPATH_LOCATOR = "//input[@name='emailAddress']";
    public static final String PASSWORD_INPUT_XPATH_LOCATOR = "//li[contains(@class, 'password-field')]//input";
    public static final String JOIN_BUTTON_XPATH_LOCATOR = "//*[contains(@class, 'join-btn')]";
    public static final String FACEBOOK_BUTTON_XPATH_LOCATOR = "//*[@class = 'fb-btn']";
    public static final String SIGN_IN_BUTTON__CSS_LOCATOR = ".signin-link > a";
    public static final String ERROR_ALERT_MESSAGE_CSS_LOCATOR = ".uno-alert strong";


    private WebDriver driver;
    private ElementHelper helper = new ElementHelper();

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterFirstName(String name) {
        WebElement input = driver.findElement(By.xpath(LocatorsClass.FIRST_NAME_INPUT_XPATH_LOCATOR));
        helper.enterText(input, name);

    }

    public void enterLastName(String LastName) {
        WebElement input = driver.findElement(By.xpath(LocatorsClass.LAST_NAME_INPUT_XPATH_LOCATOR));
        helper.enterText(input, LastName);


    }

    public void enterPassword(String password) {
        WebElement input = driver.findElement(By.xpath(LocatorsClass.PASSWORD_INPUT_XPATH_LOCATOR));
        helper.enterText(input, password);

    }

    public void enterEmail(String email) {
        WebElement input = driver.findElement(By.xpath(LocatorsClass.EMAIL_INPUT_XPATH_LOCATOR));
        helper.enterText(input, email);

    }

    public void clickjoinButton(String join) {
        WebElement button = driver.findElement(By.cssSelector(LocatorsClass.LAST_NAME_INPUT_CSS_LOCATOR));
        button.click();

    }
}
