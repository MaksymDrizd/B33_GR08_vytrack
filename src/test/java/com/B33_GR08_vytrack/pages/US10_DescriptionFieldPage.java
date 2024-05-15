package com.B33_GR08_vytrack.pages;



import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_DescriptionFieldPage extends BasePage {

    public US10_DescriptionFieldPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a/span[@class='title title-level-1' and contains(., 'Activities')]")
    public WebElement activitiesMenuButton;


    @FindBy(xpath ="//a/span[.='Calendar Events']")
    public WebElement calendarEvents;


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(id = "tinymce")
    public WebElement descriptionField;

    @FindBy(xpath = "//iframe[contains(@id,'oro_calendar_event_form_description')]")
    public WebElement descriptionIFrame;



}
