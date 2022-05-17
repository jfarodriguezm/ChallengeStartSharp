package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage extends PageObject {

    public static final Target MEETING_MENU = Target.the("where do we view the meeting options")
            .located(By.xpath("//a[@href='#nav_menu1_3_2']"));
    public static final Target MEETINGS_BUTTON = Target.the("where do we view the meetings")
            .located(By.xpath("//a[@href='/demo/Meeting/Meeting']"));
    public static final Target NEW_MEETING_BUTTON = Target.the("button to create a new meeting")
            .located(By.xpath("//div[@class='tool-button add-button icon-tool-button']"));
    public static final Target MEETING_NAME = Target.the("where do we write the meeting name")
            .located(By.name("MeetingName"));
    public static final Target MEETING_NUMBER = Target.the("where do we write the meeting name")
            .located(By.name("MeetingNumber"));
    public static final Target MEETING_TYPE = Target.the("where do we select the meeting type")
            .located(By.xpath("//div[@class='field MeetingTypeId col-sm-6']//a[@class='select2-choice']"));
    public static final Target MEETING_TYPE_INPUT = Target.the("where do we insert the meeting type")
            .located(By.xpath("//div[@id='select2-drop']//input"));
    public static final Target MEETING_START_DATE = Target.the("where do we write the meeting start date")
            .located(By.name("StartDate"));
    public static final Target MEETING_END_DATE = Target.the("where do we write the meeting end date")
            .located(By.name("EndDate"));
    public static final Target MEETING_START_HOUR = Target.the("where do we write the meeting end date")
            .located(By.xpath("//div[@class='field StartDate col-sm-6']//select"));
    public static final Target MEETING_END_HOUR = Target.the("where do we write the meeting end date")
            .located(By.xpath("//div[@class='field EndDate col-sm-6']//select"));
    public static final Target MEETING_LOCATION = Target.the("where do we select the meeting type")
            .located(By.xpath("//div[@class='field LocationId col-sm-6']//a[@class='select2-choice select2-default']"));
    public static final Target LOCATION_INPUT = Target.the("where do we select the parent unit name")
            .located(By.xpath("//div[@id='select2-drop']//input"));
    public static final Target MEETING_UNIT = Target.the("where do we select the meeting type")
            .located(By.xpath("//div[@class='field UnitId col-sm-6']//a[@class='select2-choice select2-default']"));
    public static final Target UNIT_INPUT = Target.the("where do we select the parent unit name")
            .located(By.xpath("//div[@id='select2-drop']//input"));
    public static final Target MEETING_ORGANIZEDBY = Target.the("where do we select the meeting type")
            .located(By.xpath("//div[@class='field OrganizerContactId col-sm-6']//a[@class='select2-choice select2-default']"));
    public static final Target ORGANIZEDBY_INPUT = Target.the("where do we select the parent unit name")
            .located(By.xpath("//div[@id='select2-drop']//input"));
    public static final Target MEETING_REPORTER = Target.the("where do we select the meeting type")
            .located(By.xpath("//div[@class='field ReporterContactId col-sm-6']//a[@class='select2-choice select2-default']"));
    public static final Target REPORTER_INPUT = Target.the("where do we select the parent unit name")
            .located(By.xpath("//div[@id='select2-drop']//input"));
    public static final Target MEETING_ATTENDEE_LIST = Target.the("where do we select the meeting type")
            .located(By.xpath("//div[@class='field AttendeeList']//a[@class='select2-choice select2-default']"));
    public static final Target ATTENDEE_LIST_INPUT = Target.the("where do we select the parent unit name")
            .located(By.xpath("//div[@id='select2-drop']//input"));
    public static final Target SAVE_BUTTON = Target.the("button to save meeting")
            .located(By.xpath("//div[@class]//div[@class='tool-button save-and-close-button icon-tool-button']"));

}
