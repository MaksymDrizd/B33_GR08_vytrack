package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_PinbarPage {

    public US03_PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText= "Learn how to use this space")
    public WebElement learnHowToUseThisSpace;

    @FindBy(xpath = "//h3[text()='How To Use Pinbar']")
    public WebElement howToUsePinbar;


    @FindBy(xpath = "//div/p[1]")
    public WebElement usePinIconOnTheRightTopCornerOfPageToCreateFastAccessLinkInThePinbar;

    @FindBy(xpath = "//div/p/img")
    public WebElement image;

}
