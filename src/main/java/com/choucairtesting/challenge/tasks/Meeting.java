package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.choucairtesting.challenge.userinterface.BusinessUnitPage.INPUT_PARENTUNIT;
import static com.choucairtesting.challenge.userinterface.MeetingPage.*;



public class Meeting implements Task {

    private String strMeetingName;
    private String strMeetingType;
    private String strMeetingNumber;
    private String strStartDate;
    private String strEndDate;
    private String strStartHour;
    private String strEndHour;
    private String strLocation;
    private String strUnit;
    private String strOrganizedBy;
    private String strReporter;
    private String strAttendeeList;

    public Meeting(List<Data> data) {
        this.strMeetingName = data.get(0).getStrMeetingName();
        this.strMeetingType = data.get(0).getStrMeetingType();
        this.strMeetingNumber = data.get(0).getStrMeetingNumber();
        this.strStartDate = data.get(0).getStrStartDate();
        this.strEndDate = data.get(0).getStrEndDate();
        this.strStartHour = data.get(0).getStrStartHour();
        this.strEndHour = data.get(0).getStrEndHour();
        this.strLocation = data.get(0).getStrLocation();
        this.strUnit = data.get(0).getStrUnit();
        this.strOrganizedBy = data.get(0).getStrOrganizedBy();
        this.strReporter = data.get(0).getStrReporter();
        this.strAttendeeList = data.get(0).getStrAttendeeList();
    }

    public static Meeting createAMeetingWith(List<Data> data) {
        return Tasks.instrumented(Meeting.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MEETING_MENU),
                Click.on(MEETINGS_BUTTON),
                Click.on(NEW_MEETING_BUTTON),
                Enter.theValue(strMeetingName).into(MEETING_NAME),
                Click.on(MEETING_TYPE),
                Enter.theValue(strMeetingType).into(MEETING_TYPE_INPUT).thenHit(Keys.ENTER),
                Enter.theValue(strMeetingNumber).into(MEETING_NUMBER),
                Enter.theValue(strStartDate).into(MEETING_START_DATE),
                SelectFromOptions.byValue(strStartHour).from(MEETING_START_HOUR),
                Enter.theValue(strEndDate).into(MEETING_END_DATE),
                SelectFromOptions.byValue(strEndHour).from(MEETING_END_HOUR),
                Click.on(MEETING_LOCATION),
                Enter.theValue(strLocation).into(LOCATION_INPUT).thenHit(Keys.ENTER),
                Click.on(MEETING_UNIT),
                Enter.theValue(strUnit).into(UNIT_INPUT).thenHit(Keys.ENTER),
                Click.on(MEETING_ORGANIZEDBY),
                Enter.theValue(strOrganizedBy).into(ORGANIZEDBY_INPUT).thenHit(Keys.ENTER),
                Click.on(MEETING_REPORTER),
                Enter.theValue(strReporter).into(REPORTER_INPUT).thenHit(Keys.ENTER),
                Click.on(MEETING_ATTENDEE_LIST),
                Enter.theValue(strAttendeeList).into(ATTENDEE_LIST_INPUT).thenHit(Keys.ENTER),
                Click.on(SAVE_BUTTON)
        );

    }
}
