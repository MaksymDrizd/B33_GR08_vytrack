package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_CalendarEventsPage extends BasePage{

    public US08_CalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventButton;
    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;
    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement intervalInputBox;
    @FindBy(xpath = "//span[@class='validation-failed']")
    public WebElement errorMessage;

    public void goToCalendarEventsPage(){
        navigateToModule("Activities","Calendar Events");
    }

}
