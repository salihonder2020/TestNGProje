package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class WaitTest extends TestBase {
    @Test
            public void WaitTest(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        //<button autocomplete="off" type="button" onclick="swapCheckbox()">Remove</button>
        WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
        element.click();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //It's gone!
        //WebElement element = driver.findElement(By.xpath("//button[@type='button']"));
        //  <p id="message">It's gone!</p>
        WebElement yazi = driver.findElement(By.id("message"));
        Assert.assertEquals(yazi, "It's gone!");
    }

}

