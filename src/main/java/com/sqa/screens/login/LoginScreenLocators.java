package com.sqa.screens.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginScreenLocators {
    @FindBy(id = "user-name")
    WebElement userNameTextField;
    @FindBy(id = "password")
    WebElement passwordTextField;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(id = "header_container")
    WebElement pageHeader;

    public WebElement getUserNameTextField() {
        return userNameTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getPageHeader() {
        return pageHeader;
    }
}
