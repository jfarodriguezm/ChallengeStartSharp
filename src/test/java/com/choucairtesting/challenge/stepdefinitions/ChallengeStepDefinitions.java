package com.choucairtesting.challenge.stepdefinitions;

import com.choucairtesting.challenge.model.Data;
import com.choucairtesting.challenge.questions.TheBusinessUnit;
import com.choucairtesting.challenge.questions.TheMeeting;
import com.choucairtesting.challenge.tasks.Login;
import com.choucairtesting.challenge.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.choucairtesting.challenge.tasks.BusinessUnit.createABusinessUnitWith;
import static com.choucairtesting.challenge.tasks.Meeting.createAMeetingWith;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ChallengeStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than John is already login in the platform$")
    public void than_Jhon_is_already_login_in_the_platform(List<Data> data) {
        theActorCalled("Jhon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(data.get(0).getStrUser(),data.get(0).getStrPassword())));
    }

    @When("^he create a business unit$")
    public void he_create_a_business_unit(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(createABusinessUnitWith(data.get(0).getStrNomBusinessUnit(), data.get(0).getStrNomParentUnit()));
    }

    @Then("^the Business Unit (.*) is already listed$")
    public void the_business_unit_is_already_listed(String question) {
        theActorInTheSpotlight().should(seeThat(TheBusinessUnit.isAlreadyCreate(question)));
    }

    @When("^he create a new meeting$")
    public void he_create_a_new_meeting(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(createAMeetingWith(data));
    }

    @Then("^the new (.*) is already listed$")
    public void the_new_meeting_is_already_listed(String question) {
        theActorInTheSpotlight().should(seeThat(TheMeeting.isAlreadyCreate(question)));
    }

}
