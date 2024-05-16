package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.US05VehicleModelPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class US05StepDef {

    US05VehicleModelPage us05VehicleModelPage = new US05VehicleModelPage();


    @When("the user navigates to {string} - {string}")
    public void the_user_navigates_to(String string, String string2) {
        us05VehicleModelPage.waitUntilLoaderScreenDisappear();
        us05VehicleModelPage.navigateToModule("Fleet","Vehicles Model");
        BrowserUtils.waitForPageToLoad(10);
    }

    @Then("the user should see following column options")
    public void the_user_should_see_following_column_options(List<String> expectedColumns) {
        BrowserUtils.waitFor(3);
        List<String> actualColumns = BrowserUtils.getElementsText(us05VehicleModelPage.columnOptions);
        actualColumns.removeIf(p -> p.isBlank());
       Set<String> set = new LinkedHashSet<>(actualColumns);

        System.out.println("actualColumns = " + actualColumns);
        System.out.println("set = " + set);
        Assert.assertEquals(expectedColumns,new LinkedList<>(set));
    }


    @Then("the user should see {string} message")
    public void the_user_should_see_message(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage,us05VehicleModelPage.errorMessage.getText());
        System.out.println("us05VehicleModelPage.errorMessage.getText() = " + us05VehicleModelPage.errorMessage.getText());


    }

}
