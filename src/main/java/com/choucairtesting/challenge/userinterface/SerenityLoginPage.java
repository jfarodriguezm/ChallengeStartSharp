package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the user")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
