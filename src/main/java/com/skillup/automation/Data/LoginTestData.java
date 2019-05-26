package com.skillup.automation.Data;

import org.testng.annotations.DataProvider;

import static com.skillup.automation.utils.StringRandomGenerator.getRandomEmail;

public class LoginTestData {
    @DataProvider(name = "SetEnvironment")
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {getRandomEmail(10), "", "Please enter a password"},
                {getRandomEmail(10), "___!a432sdfsdf", "Hm, that's not the right password"}
        };

        return browserProperty;
    }

}
