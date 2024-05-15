package com.B33_GR08_vytrack.step_definitions;

import com.B33_GR08_vytrack.pages.QuestionMarkIconPage;
import com.B33_GR08_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;


public class QuestinMarkDef {

    QuestionMarkIconPage questionMarkIconPage=new QuestionMarkIconPage();

    @Then("user click on the question mark icon")
    public void user_click_on_the_question_mark_icon() {

        questionMarkIconPage.questMarIcon.click();
    }
    @Then("user should access to the Oroinc Documentation page")
    public void user_should_access_to_the_oroinc_documentation_page() {

        BrowserUtils.switchWindowAndVerify("https://qa.translantik.com","Welcome to Oro Documentation");
    }
}
