package com.skillup.automation.SignUp;

import com.skillup.automation.TestRunner;
import com.skillup.automation.pages.SignUpPage;
import com.skillup.automation.utils.ElementHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeSignUpByFactoryTest extends TestRunner {


    private static final String LINKED_IN_JOIN_PAGE_URL = "https://www.linkedin.com/start/join";

    private static final String EXPECTED_EMAIL_ERROR_MESSAGE = "Please enter your email address";


    @BeforeMethod
    private void before() {
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void signup() {

            driver.get(LINKED_IN_JOIN_PAGE_URL);

            signUpPage.enterFirstName("firstName");
            signUpPage.enterLastName("lastName");
            signUpPage.enterEmail("");
            signUpPage.enterPassword("skillauto904");
            signUpPage.clickjoinButton("");


        }

}
