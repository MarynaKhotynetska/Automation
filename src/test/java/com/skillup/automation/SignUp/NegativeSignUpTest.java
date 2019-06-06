package com.skillup.automation.SignUp;

import com.skillup.automation.LocatorsClass;
import com.skillup.automation.TestRunner;
import com.skillup.automation.pages.SignUpPage;
import com.skillup.automation.utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeSignUpTest extends TestRunner {

    private static final String LINKED_IN_JOIN_PAGE_URL = "https://www.linkedin.com/start/join";

    private static final String EXPECTED_EMAIL_ERROR_MESSAGE = "Укажите пароль.";

    private ElementHelper helper = new ElementHelper();
    private SignUpPage signUpPage;


    @BeforeMethod
    private void before() {
        signUpPage = new SignUpPage(driver);
    }


    @Test
    public void verifyNotSignUpWithInvalidCredantial() {

        driver.get(LINKED_IN_JOIN_PAGE_URL);

        signUpPage.enterFirstName("firstName");
        signUpPage.enterLastName("lastName");
        signUpPage.enterEmail("");
        signUpPage.enterPassword("password123");
        signUpPage.clickjoinButton("");


        WebElement alertMessage = driver.findElement(By.cssSelector(LocatorsClass.ERROR_ALERT_MESSAGE_CSS_LOCATOR));
        String alertMessageText = alertMessage.getText();

        Assert.assertEquals(alertMessageText, EXPECTED_EMAIL_ERROR_MESSAGE, "Укажите пароль.");
    }


    @Test
    public void verifyErrorMessageForEmptyPasswordField() {
        driver.get(LINKED_IN_JOIN_PAGE_URL);

        WebElement firstNameInput = driver.findElement(By.xpath(LocatorsClass.FIRST_NAME_INPUT_XPATH_LOCATOR));
        WebElement lastNameInput = driver.findElement(By.xpath(LocatorsClass.LAST_NAME_INPUT_XPATH_LOCATOR));
        WebElement emailInput = driver.findElement(By.xpath(LocatorsClass.EMAIL_INPUT_XPATH_LOCATOR));
        WebElement passwordInput = driver.findElement(By.xpath(LocatorsClass.PASSWORD_INPUT_XPATH_LOCATOR));

        helper.enterText(firstNameInput, "firstName");
        helper.enterText(lastNameInput, "lastName");
        helper.enterText(emailInput, "someemail@email.com");
        helper.enterText(passwordInput, "");

        WebElement joinButton = driver.findElement(By.xpath(LocatorsClass.JOIN_BUTTON_XPATH_LOCATOR));
        joinButton.click();

        WebElement alertMessage = driver.findElement(By.cssSelector(LocatorsClass.ERROR_ALERT_MESSAGE_CSS_LOCATOR));
        String alertMessageText = alertMessage.getText();

        Assert.assertEquals(alertMessageText, EXPECTED_EMAIL_ERROR_MESSAGE, "Укажите пароль.");
    }
}


//    @Test
//    public void verifyErrorMessageForEmptyPasswordField() {
//        driver.get(LINKED_IN_JOIN_PAGE_URL);
//
//        WebElement firstNameInput = driver.findElement(By.xpath(LocatorsClass.FIRST_NAME_INPUT_XPATH_LOCATOR));
//        WebElement lastNameInput = driver.findElement(By.xpath(LocatorsClass.LAST_NAME_INPUT_XPATH_LOCATOR));
//        WebElement emailInput = driver.findElement(By.xpath(LocatorsClass.EMAIL_INPUT_XPATH_LOCATOR));
//        WebElement passwordInput = driver.findElement(By.xpath(LocatorsClass.PASSWORD_INPUT_XPATH_LOCATOR));
//
//
//        firstNameInput.clear();
//        firstNameInput.sendKeys("firstName");
//
//        lastNameInput.clear();
//        firstNameInput.sendKeys("lastName");
//
//        emailInput.clear();
//        firstNameInput.sendKeys("some1111@skillup.com");
//
//        passwordInput.clear();
//        firstNameInput.sendKeys("");

//        WebElement joinButton =  driver.findElement(By.xpath(LocatorsClass.JOIN_BUTTON_XPATH_LOCATOR));
//        joinButton.click();
//
//        WebElement alertMessage = driver.findElement( By.cssSelector(LocatorsClass.ERROR_ALERT_MESSAGE_CSS_LOCATOR));
//        String alertMessageText = alertMessage.getText();
//
//        Assert.assertEquals(alertMessageText, EXPECTED_EMAIL_ERROR_MESSAGE, "Alert Message is incorect");
//
//
//    }
//}
