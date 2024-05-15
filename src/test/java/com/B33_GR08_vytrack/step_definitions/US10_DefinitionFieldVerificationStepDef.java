package com.B33_GR08_vytrack.step_definitions;


import com.B33_GR08_vytrack.pages.US10_DescriptionFieldPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import com.B33_GR08_vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_DefinitionFieldVerificationStepDef {

    US10_DescriptionFieldPage descriptionFieldPage = new US10_DescriptionFieldPage();



    @Then("user hover over Activities module and click on Calendar Events")
    public void user_hover_over_activities_module_and_click_on_calendar_events() {


        BrowserUtils.waitForVisibility(descriptionFieldPage.activitiesMenuButton,60);
      descriptionFieldPage.navigateToModule("Activities","Calendar Events");

    }
    @When("users click on the button Create Calendar Event")
    public void users_click_on_the_button_create_calendar_event() {
        BrowserUtils.waitForClickablility(descriptionFieldPage.createCalendarEvent,120);
        BrowserUtils.waitFor(4);
        descriptionFieldPage.createCalendarEvent.click();


    }
    @Then("users should be able to see and type into the Description field")
    public void users_should_be_able_to_see_and_type_into_the_description_field() {
        Driver.getDriver().switchTo().frame(descriptionFieldPage.descriptionIFrame);
        descriptionFieldPage.descriptionField.sendKeys("Scrum daily meeting");

        String expected = "Scrum daily meeting";
        String actual = descriptionFieldPage.descriptionField.getText();
        Assert.assertEquals(expected, actual);






    }

}
