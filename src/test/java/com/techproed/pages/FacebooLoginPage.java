package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebooLoginPage {

    WebDriver driver;
    public FacebooLoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy ( id = "email")
    public WebElement emailKutusu;

    @FindBy ( id = "pass")
    public WebElement sifreKutusu;

    @FindBy ( id = "u_0_d")
    public WebElement onayKutusu;
}
