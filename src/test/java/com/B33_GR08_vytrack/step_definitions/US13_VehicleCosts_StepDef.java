package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.US13_VehicleCostsPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class US13_VehicleCosts_StepDef {

    US13_VehicleCostsPage us13_vehicleCostsPage = new US13_VehicleCostsPage();


    @Then("User click the Vehicle Costs module")
    public void user_click_the_vehicle_costs_module() {

        us13_vehicleCostsPage.VehicleCosts.click();
        BrowserUtils.sleep(3);
    }

    @Then("User should see the following column options")
    public void userShouldSeeTheFollowingColumnOptions(List<String> ExpectedColumns) {


        BrowserUtils.waitFor(3);
        List<String> ActualColumns = BrowserUtils.getElementsText(us13_vehicleCostsPage.columns);
        ActualColumns.removeIf(p -> p.isBlank());
        Set<String> set = new LinkedHashSet<>(ActualColumns);

        System.out.println("actualColumns = " + ActualColumns);
        System.out.println("set = " + set);
        Assert.assertEquals(ExpectedColumns, new LinkedList<>(set));
    }


    @Then("User can check the first checkbox to select All Vehicle Costs")
    public void userCanCheckTheFirstCheckboxToSelectAllVehicleCosts() {

        BrowserUtils.waitForClickablility(us13_vehicleCostsPage.firstCheckBox, 5);
        us13_vehicleCostsPage.firstCheckBox.click();

        // check if all Vehicle Costs are selected
        List<WebElement> listBox = us13_vehicleCostsPage.ListBox;
        for (WebElement eachBox : listBox) {
            if (!eachBox.isSelected()) {
                System.out.println("is not Selected");
            }

        }


    }
}
