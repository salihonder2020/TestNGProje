package com.techproed.smoketests;

import com.techproed.pages.FhcTripHotelRoomCreatePage01;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FhcTripHotelRoomCreateTest01 extends TestBase {

    public void giris(){
        driver.findElement(By.id("UserName")).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.id("Password")).sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

    @Test
    public void test(){
        driver.get(ConfigurationReader.getProperty("room_create_url"));
        giris();
        FhcTripHotelRoomCreatePage01 room = new FhcTripHotelRoomCreatePage01(driver);

        Select select = new Select(room.idHotel);
        select.selectByIndex(3);

        room.code.sendKeys("183965");

        room.name.sendKeys("Suit");

        room.location.sendKeys("Balkonlu Guney Dogu");

        room.description.sendKeys("Odenen Ucret Iade edilmez");

        Actions action = new Actions(driver);
        action.dragAndDrop(room.fiyat500, room.price).perform();

        Select select1 = new Select(room.iDGroupRoomType);
        select1.selectByIndex(3);

        room.maxAdultCount.sendKeys("2");

        room.maxChildCount.sendKeys("3");

        room.approved.click();

        room.submit.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(room.bootbox.getText());
        boolean basarili = room.bootbox.isDisplayed();

        Assert.assertTrue(basarili);



    }

}
