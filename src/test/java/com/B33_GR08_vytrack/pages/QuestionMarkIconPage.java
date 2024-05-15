package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionMarkIconPage extends BasePage {

    public QuestionMarkIconPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//i[@class='fa-question-circle']")
    public WebElement questMarIcon;
}
