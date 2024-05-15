package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US011_CarOdometerPage {

    public US011_CarOdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='#'])[4]")
    public WebElement Fleet;


    @FindBy(linkText = "Vehicle Odometer")
    public WebElement VehicleOdometer;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement fleet;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPage;

    @FindBy(xpath = "//div[@class='page-size pull-right form-horizontal']//button")
    public WebElement pageByDefault;
}


