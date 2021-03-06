package com.techproed.smoketests;

import com.github.javafaker.Faker;
import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class GlbSignUpTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite çalıştı");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest çalıştı");
    }
    @Test (groups = {"signin" , "login"})
    public void test(){
        //* 1. Adım : https://www.glbtrader.com/register-verified.html adresine gidelim
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_register_url"));

         //* 2. Adım : GlbSignUpPage class'ından nesne üretip, webelementleri kullanalım.
        GlbSignUpPage glbSignUpPage = new GlbSignUpPage();

        // * 3. Adım : İçerisine ekleyeceğimiz bilgileri (name, email, phone vs) yine
        Faker faker = new Faker();
        glbSignUpPage.eMail.sendKeys(faker.internet().emailAddress());

        glbSignUpPage.isim.sendKeys(faker.name().fullName());

        glbSignUpPage.telefon.sendKeys(ConfigurationReader.getProperty("telefon"));

        glbSignUpPage.sifrre.sendKeys(ConfigurationReader.getProperty("fb_pass"));

        glbSignUpPage.tekrarSifrre.sendKeys(ConfigurationReader.getProperty("fb_pass"));

        glbSignUpPage.submitt.click();

        // *           ConfigurationReader kullanarak, properties file'dan alalım.
        // * 4. Adım : Sign-Up butonuna tıklayalım.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // * 5. Adım : Success yazısını görüp görmediğimi Assert ile doğrulayalım.

        System.out.println(glbSignUpPage.succesYazisi.getText());
        boolean dogruMu = glbSignUpPage.succesYazisi.getText().contains("Success");
        Assert.assertTrue(dogruMu);
    }
    @AfterClass
    public void tearDown(){
        // Driver class'ının içerisindeki closeDriver methodunu çağırmamız yeterli.
        // Driver'ı kapattık ve hafızadan sildik.
        Driver.closeDriver();
    }
}