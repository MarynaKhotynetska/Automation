package com.skillup.automation;

public class LocatorsClass {

        public static final String FIRST_NAME_INPUT_XPATH_LOCATOR = "//input[@id='first-name']";
        public static final String FIRST_NAME_INPUT_CSS_LOCATOR   = "input#first-name";

        public static final String LAST_NAME_INPUT_XPATH_LOCATOR = "//input[@id='last-name']";
        public static final String LAST_NAME_INPUT_CSS_LOCATOR   = "input#last-name";

        //via name attribute, just for an example
        public static final String EMAIL_INPUT_XPATH_LOCATOR = "//input[@name='emailAddress']";
        public static final String EMAIL_INPUT_CSS_LOCATOR   = "input[name='emailAddress']";

        //via parent element with contains, just for an example
        public static final String PASSWORD_INPUT_XPATH_LOCATOR = "//li[contains(@class, 'password-field')]//input";
        public static final String PASSWORD_INPUT_CSS_LOCATOR   = "li.password-field input";

        //via contains class not spec html tag
        public static final String JOIN_BUTTON_XPATH_LOCATOR = "//*[contains(@class, 'join-btn')]";
        public static final String JOIN_BUTTON__CSS_LOCATOR  = ".join-btn";

        //via strict class equal not spec html tag
        public static final String FACEBOOK_BUTTON_XPATH_LOCATOR = "//*[@class = 'fb-btn']";
        public static final String FACEBOOK_BUTTON__CSS_LOCATOR  = ".fb-btn";

        //signin-link
        public static final String SIGN_IN_BUTTON_XPATH_LOCATOR = "//*[@class = 'signin-link']/a";
        public static final String SIGN_IN_BUTTON__CSS_LOCATOR  = ".signin-link > a";


        public static final String ERROR_ALERT_MESSAGE_CSS_LOCATOR = ".uno-alert strong";
    }


