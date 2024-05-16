package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class US05VehicleModelPage extends BasePage {


//    US05VehicleModelPage(){
//        PageFactory.initElements(Driver.getDriver(),this);
//    }

    @FindBy(css = ".grid-header-cell__label")
    public List<WebElement> columnOptions;

    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement errorMessage;
}
