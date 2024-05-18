package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.US07_SelectCheckboxPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US07_SelectCheckbox_StepDef {

    US07_SelectCheckboxPage us07Page=new US07_SelectCheckboxPage();

    @When("user hover over fleet and select Vehicles")
    public void userHoverOverFleetAndSelectVehicles() {
        BrowserUtils.sleep(5);
        us07Page.navigateToModule("Fleet","Vehicles" );
    }

    @And("user can see all the checkboxes as unchecked.")
    public void userCanSeeAllTheCheckboxesAsUnchecked() {
        BrowserUtils.sleep(3);
// check the first box is unchecked
        WebElement element=us07Page.firstBox;
        Boolean expectedResult=true;
        Boolean actualResult= !element.isSelected();
        Assert.assertEquals(expectedResult,actualResult);
// check all boxes are unchecked
        List<WebElement> listBox=us07Page.allBoxs;
        for (WebElement eachBox : listBox) {
            if (eachBox.isSelected()){
                System.out.println("Box checked");
            }
        }
    }


    @When("user can check the first checkbox to select all the cars")
    public void userCanCheckTheFirstCheckboxToSelectAllTheCars() {

        BrowserUtils.waitForClickablility(us07Page.firstBox,5);
        us07Page.firstBox.click();

        // check if all boxes are selected
        List<WebElement> listBox = us07Page.allBoxs;
        for (WebElement eachBox : listBox) {
            if (!eachBox.isSelected()) {
                System.out.println("is not Selected");
            }
        }

    }
    @And("user users can select any car")
    public void userUsersCanSelectAnyCar() {

           // check if boxes are selected 1 by 1 to make sure user can Select Any Car
        List<WebElement> listBox = us07Page.allBoxs;
        for (WebElement eachBox : listBox) {
           // BrowserUtils.selectCheckBox(eachBox,true);
            eachBox.click();
            BrowserUtils.sleep(1);
            eachBox.click();//Optional

        }
    }
}