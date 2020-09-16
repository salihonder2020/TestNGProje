package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcTripHotelRoomCreatePage01 {
    WebDriver driver;
    public FhcTripHotelRoomCreatePage01(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy ( id = "IDHotel")
    public WebElement idHotel;

    @FindBy ( id = "Code")
    public WebElement code;

    @FindBy ( id = "Name")
    public WebElement name;

    @FindBy ( id = "Location")
    public WebElement location;

    @FindBy ( xpath = "//textarea[@dir='ltr']")
    public WebElement description;

    @FindBy ( id = "Price")
    public WebElement price;

    @FindBy ( partialLinkText = "500")
    public WebElement fiyat500;

    @FindBy ( id = "IDGroupRoomType")
    public WebElement iDGroupRoomType;

    @FindBy ( id = "MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy ( id = "MaxChildCount")
    public WebElement maxChildCount;

    @FindBy ( id = "uniform-IsAvailable")
    public WebElement approved;

    @FindBy ( id = "btnSubmit")
    public WebElement submit;

    @FindBy ( xpath = "//div[@class='bootbox-body']")
    public WebElement bootbox;
}
