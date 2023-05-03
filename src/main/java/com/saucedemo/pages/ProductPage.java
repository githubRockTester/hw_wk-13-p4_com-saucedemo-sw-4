package com.saucedemo.pages;

import com.saucedemo.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v110.overlay.model.LineStyle;

import java.util.List;

public class ProductPage extends Utilities {
    By emailField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");
    //By productCount = By.className("inventory_item");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public int getActualNumberOfProducts() {
        List<WebElement> productCount = driver.findElements(By.className("inventory_item"));
        return productCount.size();
    }
}
