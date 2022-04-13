package com.sqa.screens.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
    LoginScreenLocators loginScreenLocators;

    public LoginScreen(WebDriver driver, LoginScreenLocators loginScreenLocators) {
        this.loginScreenLocators = loginScreenLocators;
        PageFactory.initElements(driver, loginScreenLocators);
    }

    public void fillUserName(String userName) {
        loginScreenLocators.getUserNameTextField().sendKeys(userName);
    }

    public void fillPassword(String password) {
        loginScreenLocators.getPasswordTextField().sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginScreenLocators.getLoginButton().click();
    }

    public void loginToSystem(String userName, String password) {
        fillUserName(userName);
        fillPassword(password);
        clickOnLoginButton();
    }

    public boolean checkIfPageHeaderIsDisplayed() {
        return loginScreenLocators.getPageHeader().isDisplayed();
    }
}
