package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.US011_CarOdometerPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US011_CarOdometer_StepDef {

    US011_CarOdometerPage US011CarOdometerPage = new US011_CarOdometerPage();


    @Then("User hover over Fleet module")
    public void user_hover_over_fleet_module() {
   BrowserUtils.sleep(3);
   BrowserUtils.hover(US011CarOdometerPage.Fleet);


    }
    @Then("User click the Vehicle Odometer module")
    public void user_click_the_vehicle_odometer_module() {

   US011CarOdometerPage.VehicleOdometer.click();
   BrowserUtils.sleep(3);

    }
    @Then("User should see the error message “You do not have permission to perform this action.”")
    public void user_should_see_the_error_message_you_do_not_have_permission_to_perform_this_action() {
    String ExpectedMessage = "You do not have permission to perform this action.";
    String ActualMessage = US011CarOdometerPage.errorMessage.getText();

        Assert.assertEquals(ExpectedMessage,ActualMessage);

    }
    @Then("User hover over fleet module")
    public void userHoverOverFleetModule() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(US011CarOdometerPage.fleet);

    }


    @Then("User should see the default page as {int}")
    public void userShouldSeeTheDefaultPageAs(int Page) {

        BrowserUtils.sleep(3);
    String ExpectedPage = String.valueOf(Page);
    String ActualPage = US011CarOdometerPage.defaultPage.getAttribute("value");
   Assert.assertEquals(ExpectedPage ,ActualPage);


    }

    @Then("User should see the View Per Page as {int} by default")
    public void userShouldSeeTheViewPerPageAsByDefault(int viewPerPage){
            BrowserUtils.sleep(3);
        String ExpectedViewPerPage = String.valueOf(viewPerPage);

        String ActualViewPerPage = US011CarOdometerPage.pageByDefault.getText();


        Assert.assertEquals(ExpectedViewPerPage,ActualViewPerPage);


    }


}
