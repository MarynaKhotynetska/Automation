package com.skillup.automation.Lesson2;

import com.skillup.automation.Lesson2.Calculator;
import com.skillup.automation.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends TestRunner {

    private static final String EXPECTED_TITLE = "Google";
    private static final String URL = "https://www.google.com/";
    private static final String EXPECTED_URL = "google.com";



    @Test
    public void myTest() {
        driver.get(URL);

        String actualTitle = driver.getTitle();

        Assert.assertEquals (actualTitle, EXPECTED_TITLE);


    }
    @Test
    public void myTestHomework() {
        driver.get(URL);
        String actualURL = driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(EXPECTED_URL),
                String.format("Does not contain an expected value," +
                "actual url: %s, expected part: %s'=", actualURL, EXPECTED_URL));
    }


    @Test (expectedExceptions = ArithmeticException.class)
    public void test() {
        Calculator calculator = new Calculator();
        calculator.divide(1, 0);
    }

    }


