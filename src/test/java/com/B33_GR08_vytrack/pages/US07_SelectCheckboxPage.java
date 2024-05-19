package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class US07_SelectCheckboxPage extends BasePage {

    public US07_SelectCheckboxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //

    //@FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-1239357801\"]/div[2]/div[2]/div[2]/div/table/thead/tr/th[1]/div/button/input")
    @FindBy(xpath = "(//input[@type='checkbox'])[20]")
    public  WebElement firstBox;

    @FindBy(xpath = "//input[@tabindex='-1']")
   public List <WebElement> allBoxs;

    @FindBy(xpath = "/html/body/ul/li[1]/a")
    public WebElement Button;

    //
}
