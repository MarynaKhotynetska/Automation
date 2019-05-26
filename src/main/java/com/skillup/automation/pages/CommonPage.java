package com.skillup.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPage {
    protected WebDriver driver;

    public CommonPage() {
    }

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void enterText(String locator, String text) {
        WebElement input = driver.findElement(find(locator));
        input.clear();
        input.sendKeys(text);
    }

    public void click(String locator) {
        driver.findElement(find(locator)).click();
    }

    By find(String locator) {
        if (locator.contains("//") || locator.startsWith("./")){
            return By.xpath(locator);
        }

        return By.cssSelector(locator);
    }
}
