package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.userinterface.BusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.Keys;

import static com.choucairtesting.challenge.userinterface.BusinessUnitPage.*;

public class BusinessUnit implements Task {

    private String strNomBusinessUnit;
    private String strNomParentUnit;

    public BusinessUnit(String strNomBusinessUnit, String strNomParentUnit) {
        this.strNomBusinessUnit = strNomBusinessUnit;
        this.strNomParentUnit = strNomParentUnit;
    }

    public static BusinessUnit createABusinessUnitWith(String strNomBusinessUnit, String strNomParentUnit) {
        return Tasks.instrumented(BusinessUnit.class, strNomBusinessUnit, strNomParentUnit);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORGANIZATION_MENU),
                Click.on(BUSINESSUNIT_BUTTON),
                Click.on(NEWBUSINESSUNIT_BUTTON),
                Enter.theValue(strNomBusinessUnit).into(INPUT_BUSINESSUNIT_NAME),
                Click.on(CHOSEN_PARENTUNIT),
                Enter.theValue(strNomParentUnit).into(INPUT_PARENTUNIT).thenHit(Keys.ENTER),
                Click.on(SAVE_BUTTON),
                Enter.theValue(strNomBusinessUnit).into(INPUT_SEARCH)
        );
    }
}
