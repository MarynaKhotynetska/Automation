package com.skillup.automation.Login;

public class LoginPageLocators {

    public static final String EMAIL_OR_PHONE_INPUT_XPATH_LOCATOR = "//input[@id='username']";
    public static final String EMAIL_OR_PHONE_INPUT_CSS_LOCATOR   = "input#username";

    public static final String PASSWORD_INPUT_XPATH_LOCATOR = "//input[@id='password']";
    public static final String PASSWORD_INPUT_CSS_LOCATOR   = "input#password";

    //password-visibility-toggle
    public static final String PASSWORD_TOGGLE_XPATH_LOCATOR = "//span[@id='password-visibility-toggle']";
    public static final String PASSWORD_TOGGLE_CSS_LOCATOR   = "span#password-visibility-toggle";

    public static final String SIGN_IN_BUTTON_XPATH_LOCATOR = "//*[@class = 'login__form']//button";
    public static final String SIGN_IN_BUTTON_CSS_LOCATOR   = ".login__form button";

    //via attribute contains
    public static final String FORGOT_PASSWORD_LINK_XPATH_LOCATOR = "//a[contains(@href, 'request-password-reset')]";
    public static final String FORGOT_PASSWORD_LINK_CSS_LOCATOR   = "a[href*='request-password-reset']";

    public static final String JOIN_NOW_LINK_XPATH_LOCATOR = "//a[@href ='/start/join']";
    public static final String JOIN_NOW_LINK_CSS_LOCATOR   = "a[href='/start/join']";
}

