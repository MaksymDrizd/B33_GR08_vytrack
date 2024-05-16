package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.US06_EditcarInfoPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import com.B33_GR08_vytrack.utilities.ConfigurationReader;
import com.B33_GR08_vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US06_EditCarInfoIc_StepDef {

    US06_EditcarInfoPage editCarInfo = new US06_EditcarInfoPage();


    @When("user hovers over to {string} and selects {string}")
    public void user_hovers_over_to_and_selects(String tab, String module) {
        editCarInfo.navigateToModule(tab,module);
    }

    @When("user able to see edit car info icons on the Vehicles page table")
    public void user_able_to_see_edit_car_info_icons_on_the_vehicles_page_table() {
        editCarInfo.editCarInfoDots.isDisplayed();
    }

    @Then("user can verify “view, edit, delete” options when hover the mouse over the three dots “…”")
public void user_can_verify_view_edit_delete_options_when_hover_the_mouse_over_the_three_dots() throws InterruptedException {
    //Actions action = new Actions(Driver.getDriver());
        BrowserUtils.waitForVisibility(editCarInfo.editCarInfoDots,20);
    BrowserUtils.hover(editCarInfo.editCarInfoDots);
    //editCarInfo.editCarInfoDots.click();
        //BrowserUtils.waitForVisibility(By.xpath("(//div[@class='dropdown']//ul//a)[1]"),10);
        BrowserUtils.waitFor(1);

    List<String> actualOptions = new ArrayList<>();

    //for (WebElement each : editCarInfo.deleteEditView) {
    //  actualOptions.add(each.getAttribute("title"));
    //}

    //actualOptions = BrowserUtils.getElementsTextWithAttribute ("title",editCarInfo.deleteEditView);
    List<String> expectedOptions = new ArrayList<>(Arrays.asList("View", "Edit", "Delete"));
    Assert.assertEquals(expectedOptions, BrowserUtils.getElementsTextWithAttribute ("title",editCarInfo.deleteEditView));
}
}



