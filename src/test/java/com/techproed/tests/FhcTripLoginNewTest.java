package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginNewTest extends TestBase {

    @Test
    public void test() {
        FhcTripLoginPage loginPage = new FhcTripLoginPage(driver);
        driver.get(ConfigurationReader.getProperty("fhc_login"));

        loginPage.UserName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButonu.click();

    }
}