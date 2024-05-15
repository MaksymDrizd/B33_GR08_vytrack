package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.US08_CalendarEventsPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US08_CalendarEventsStepDefs {
    US08_CalendarEventsPage calendarEventsPage = new US08_CalendarEventsPage();

    @Then("User hovers over to Activities module and selects Calendar Events")
    public void userHoversOverToActivitiesModuleAndSelectsCalendarEvents() {
        BrowserUtils.waitFor(3);
        calendarEventsPage.goToCalendarEventsPage();
        BrowserUtils.waitFor(3);
    }

    @Then("User on Calendar Events page clicks on Create Calendar event")
    public void user_on_calendar_events_page_clicks_on_create_calendar_event() {
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEventButton,60);
        calendarEventsPage.createCalendarEventButton.click();

    }
    @Then("User clicks on Repeat checkbox")
    public void user_clicks_on_repeat_checkbox() {
        calendarEventsPage.repeatCheckbox.click();

    }
    @Then("User can see the number {string} by default in the Repeat Every input option")
    public void user_can_see_the_number_by_default_in_the_repeat_every_input_option(String expectedDefaultValue) {
        String actualDefaultValue = calendarEventsPage.intervalInputBox.getAttribute("value");
        Assert.assertEquals(expectedDefaultValue,actualDefaultValue);

    }

    @Then("User delete number {int} from Repeat Every input option")
    public void user_delete_number_from_repeat_every_input_option(Integer int1) {
        calendarEventsPage.intervalInputBox.clear();

    }


    @And("User can see the error message {string}")
    public void userCanSeeTheErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = calendarEventsPage.errorMessage.getText();
                calendarEventsPage.errorMessage.isDisplayed();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }
}
