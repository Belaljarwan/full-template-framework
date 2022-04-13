package com.sqa.utils;

import com.sqa.screens.login.LoginScreen;
import com.sqa.screens.login.LoginScreenLocators;

import static com.sqa.utils.BaseClass.driver;

public class AllScreensHandler {

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver, new LoginScreenLocators());
    }
}
