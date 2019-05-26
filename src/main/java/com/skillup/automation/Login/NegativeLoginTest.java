package com.skillup.automation.Login;

import com.skillup.automation.Data.LoginTestData;
import com.skillup.automation.TestRunner;
import com.skillup.automation.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestRunner {
    private static final String EXPECTED_ERROR_MESSAGE = "Please enter a password.";

    private LoginPage loginPage;

    @BeforeMethod
    public void before() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void wrongEmailTest() {
//        driver.get(LOGIN_URL);
//        driver.get(LoginPage.LOGIN_URL);

//        loginPage.open();
//        loginPage.enterEmail("myemail@email.com");
//        loginPage.enterPassword("");
//        loginPage.clickLoginButton();

        loginPage
                .open()
                .enterEmail("myemail@email.com")
                .enterPassword("")
                .clickLoginButton()
                .assertEmailErrorMessage(EXPECTED_ERROR_MESSAGE);

//        loginPage.assertEmailErrorMessage(EXPECTED_ERROR_MESSAGE);
//        Assert.assertEquals(loginPage.getEmailErrorMessage(), EXPECTED_ERROR_MESSAGE, "Error message not match");
    }




    //DataProvider для запуску тестів



    @Test(dataProvider = "datalogin", dataProviderClass = LoginTestData.class)
    public void ddtLoginTest (String email, String pass, String expectedError) {
        loginPage
                .open()
                .enterEmail(email)
                .enterPassword (pass)
                .clickLoginButton()
                .assertEmailErrorMessage(expectedError);


    }
}
