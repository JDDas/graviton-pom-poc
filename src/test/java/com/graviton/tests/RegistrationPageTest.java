package com.graviton.tests;

import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {

    @Test
    public void registrationTest() throws InterruptedException {
        System.out.println("This is from the Test method...");
        registrationPage.registerAccount();
    }
}
