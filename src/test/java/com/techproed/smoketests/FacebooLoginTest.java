package com.techproed.smoketests;

import com.techproed.pages.FacebooLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FacebooLoginTest extends TestBase {
    @Test
    public void girisTesti(){
     driver.get("http://facebook.com");

        FacebooLoginPage loginPage = new FacebooLoginPage(driver);

        loginPage.emailKutusu.sendKeys(ConfigurationReader.getProperty("fb_email"));
        loginPage.sifreKutusu.sendKeys(ConfigurationReader.getProperty("fb_pass"));
        loginPage.onayKutusu.click();

    }
}
