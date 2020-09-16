package com.techproed.tests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {
    /*http://fhctrip-qa.com/admin/HotelAdmin/Create
            1 - FhcTripHotelCreatePage ---- PAGES paketinde
    code, name, adress, phone, mail, idgroup, save bu webelementleri @FindBy
    kullanarak locate edelim.
2 - FhcTripHotelCreateTest ---- TESTS paketinde
    FhcTripHotelCreatePage class'ından nesne üretelim ve içerisindeki webelementleri kullanarak hotel oluşturalım.*/
    public void giris() {
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test ( groups = {"fhctrip" , "hotelolusturma"})
    public void test(){
        giris();

        FhcTripHotelCreatePage fhcTripHotel = new FhcTripHotelCreatePage(driver);

        fhcTripHotel.code.sendKeys("123");
        fhcTripHotel.name.sendKeys("Salih");
        fhcTripHotel.address.sendKeys("Thunstetenstrassse 45 Langenthal");
        fhcTripHotel.phone.sendKeys("546466465949");
        fhcTripHotel.email.sendKeys("Salih@testproed.com");

        fhcTripHotel.iDGroup.sendKeys("1");
        Select select = new Select(fhcTripHotel.iDGroup);
        select.selectByIndex(2);

        fhcTripHotel.submit.submit();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(fhcTripHotel.yazi.isDisplayed());
    }





}
