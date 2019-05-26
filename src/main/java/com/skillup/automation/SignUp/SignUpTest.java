package com.skillup.automation.SignUp;

import com.skillup.automation.TestRunner;
import com.skillup.automation.pages.OnboardingPage;
import com.skillup.automation.pages.SignUpPage;
import com.skillup.automation.pages.WallPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class SignUpTest extends TestRunner {

    private SignUpPage signUpPage;
    private OnboardingPage onboardingPage;

    private static final String LINKED_IN_JOIN_PAGE_URL = "https://www.linkedin.com/start/join";


    @BeforeMethod
    public void before() {
        signUpPage = new SignUpPage (driver);
         onboardingPage= new OnboardingPage (driver);


    }
    @Test
    public void signup () {
        driver.get(LINKED_IN_JOIN_PAGE_URL);

        signUpPage.enterFirstName("firstName");
        signUpPage.enterLastName("lastName");
        signUpPage.enterEmail("skillauto904904@gmail.com");
        signUpPage.enterPassword("skillauto904");
        signUpPage.clickjoinButton("");



    }
}
