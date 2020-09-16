package com.techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TuttiChPage {
    WebDriver driver;

    public TuttiChPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy ( xpath = "//input[@placeholder='Was suchst du?']")
    public WebElement aramaKutusu;

  /*  @FindBy (linkText = "Mein tutti.ch" )
    public WebElement meinTutti;

    //<a class="_2JDRC _2Ds-6" data-automation="login-option-link" href="/de/start/login"><svg role="img" viewBox="0 0 24 24" class="svg-sprite _2Pr1v"><use xlink:href="#login"></use></svg>Einloggen</a>

    @FindBy (xpath = "//a[@data-automation='login-option-link']" )
    public WebElement einLoggen;

   */

    @FindBy ( xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy ( xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy ( xpath = "//button[@class='_3p1Wc uisSB _3dFMX _2UFbN']")
    public WebElement button;


}
