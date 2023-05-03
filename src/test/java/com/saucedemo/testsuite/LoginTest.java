package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testpage.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        loginPage.enterEmailId("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getProductText(), "Products", "Error");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        productPage.enterEmailId("standard_user");
        productPage.enterPassword("secret_sauce");
        productPage.clickOnLoginButton();
        Assert.assertEquals(productPage.getActualNumberOfProducts(), 6, "Error");
    }
}
