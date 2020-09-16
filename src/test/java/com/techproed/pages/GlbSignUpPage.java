package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GlbSignUpPage {
    public GlbSignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( id = "email")
    public WebElement eMail;

    @FindBy ( id = "name")
    public WebElement isim;

    @FindBy ( id = "mobile")
    public WebElement telefon;

    @FindBy ( id = "password")
    public WebElement sifrre;

    @FindBy ( id = "re_password")
    public WebElement tekrarSifrre;


    @FindBy ( name = "submit")
    public WebElement submitt;

    @FindBy ( xpath = "//div[@class='alert alert-success']")
    public WebElement succesYazisi;


}