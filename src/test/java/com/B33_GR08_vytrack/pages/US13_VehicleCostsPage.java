package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US13_VehicleCostsPage {

    public US13_VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(linkText = "Vehicle Costs")
    public WebElement VehicleCosts;

    @FindBy(xpath = "//*[@class='grid-header-cell__label']")
    public List<WebElement> columns;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//tr[@class='grid-row row-click-action']")
    public List<WebElement> ListBox;


}
