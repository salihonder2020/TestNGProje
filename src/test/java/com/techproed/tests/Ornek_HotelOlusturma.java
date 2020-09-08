package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Ornek_HotelOlusturma extends TestBase {
    @BeforeMethod
    public void giris(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }
    @Test
    public void hotelCreate(){
        driver.findElement(By.id("Code")).sendKeys("122");
        driver.findElement(By.id("Name")).sendKeys("Salih");
        driver.findElement(By.id("Address")).sendKeys("Hemingway 56");
        driver.findElement(By.id("Phone")).sendKeys("+415626264");
        driver.findElement(By.id("Email")).sendKeys("salih@java.com");
        driver.findElement(By.id("Code")).sendKeys("122");

        Select iDGroup = new Select(driver.findElement(By.id("IDGroup")));
        iDGroup.selectByIndex(1);
        driver.findElement(By.id("btnSubmit")).click();

        //<div class="bootbox-body">Hotel was inserted successfully</div>
        //"Hotel was inserted successfully"

        //WebElement message = driver.findElement(By.className("bootbox-body"));

        WebDriverWait wait = new WebDriverWait(driver, 3000);

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));

        Assert.assertTrue(message.isDisplayed());

    }
}