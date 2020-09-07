package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek_AmazonKayitSayfasi01 extends TestBase { // Day 14 6 Eylul 2020 Pazar
    @Test
    public void test01() {
        driver.get("http:amazon.com");
        //<a href="https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=usflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;" class="nav-a nav-a-2" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-accountList" tabindex="0">
        //  <div class="nav-line-1-container"><span class="nav-line-1">Hello, Sign in</span></div>
        //  <span class="nav-line-2 nav-long-width">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
        //  </span>
        //  <span class="nav-line-2 nav-short-width">
        //    Account
        //    <span class="nav-icon nav-arrow" style="visibility: visible;"></span>
        //  </span>
        //</a>
        WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signIn).perform();
        WebElement startHere = driver.findElement(By.partialLinkText("Start here."));
        startHere.click();

        Assert.assertTrue(driver.getTitle().equals("Amazon Registration"));
    }

    @Test (dependsOnMethods = "test1")
    public void test2() {

        // <input type="text" maxlength="50" id="ap_customer_name" autocomplete="off" name="customerName" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field auth-contact-verification-request-info">
        WebElement name = driver.findElement(By.id("ap_customer_name"));
        name.sendKeys("Salih");

        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("bastlervelo@gmail.com");

        WebElement password = driver.findElement(By.id("ap_password"));
        email.sendKeys("123456*So");
        WebElement passwordCheck = driver.findElement(By.id("ap_password_check"));
        passwordCheck.sendKeys("123456*So");

        WebElement submit = driver.findElement(By.id("continue"));
        submit.click();

    }
}
