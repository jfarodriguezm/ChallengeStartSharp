package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitPage extends PageObject {

    public static final Target ORGANIZATION_MENU = Target.the("where do we view the organization options")
            .located(By.xpath("//a[@href='#nav_menu1_3_1']"));
    public static final Target BUSINESSUNIT_BUTTON = Target.the("where do we view the Business Units")
            .located(By.xpath("//a[@href='/demo/Organization/BusinessUnit']"));
    public static final Target NEWBUSINESSUNIT_BUTTON = Target.the("button to create a new Business Unit")
            .located(By.xpath("//div[@class='tool-button add-button icon-tool-button']"));
    public static final Target INPUT_BUSINESSUNIT_NAME = Target.the("where do we write the business unit name")
            .located(By.xpath("//input[@class='editor s-Serenity-StringEditor s-StringEditor required']"));
    public static final Target CHOSEN_PARENTUNIT = Target.the("where do we select the parent unit name")
            .located(By.xpath("//span[@class='select2-chosen']"));
    public static final Target INPUT_PARENTUNIT = Target.the("where do we select the parent unit name")
            .located(By.className("select2-input"));
    public static final Target SAVE_BUTTON = Target.the("button to save the business unit")
            .located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));
    public static final Target INPUT_SEARCH = Target.the("where do we search the business unit")
            .located(By.xpath("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']"));

}
