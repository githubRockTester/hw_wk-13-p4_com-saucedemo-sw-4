package com.saucedemo.pages;

import com.saucedemo.utilities.Utilities;
import org.openqa.selenium.By;

public class LoginPage extends Utilities {
    By emailField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");
    By productText = By.xpath("//span[contains(text(),'Products')]");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getProductText() {
        return getTextFromElement(productText);
    }
}
