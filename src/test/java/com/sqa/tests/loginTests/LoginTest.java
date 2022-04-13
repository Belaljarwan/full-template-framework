package com.sqa.tests.loginTests;

import com.sqa.utils.BaseClass;
import static  org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginToSystem(){
        allScreensHandler.getLoginScreen().loginToSystem("standard_user","secret_sauce");
        assertTrue(allScreensHandler.getLoginScreen().checkIfPageHeaderIsDisplayed());
    }
}
