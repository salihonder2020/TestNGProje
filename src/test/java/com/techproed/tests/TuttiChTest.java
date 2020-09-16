package com.techproed.tests;

import com.techproed.pages.TuttiChPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TuttiChTest extends TestBase {

    @Test
    public void aramaTesti(){
        driver.get("https://www.tutti.ch/de/start/login");

       TuttiChPage tuttiChPage = new TuttiChPage(driver);
      /*  // tuttiChPage.aramaKutusu.sendKeys("Fahrrad" + Keys.ENTER);

       // tuttiChPage.meinTutti.click();
       // tuttiChPage.einLoggen.click();
       */


        tuttiChPage.email.sendKeys("bastlervelo@gmail.com");
        tuttiChPage.password.sendKeys("121412");
        tuttiChPage.button.click();


    }
}
