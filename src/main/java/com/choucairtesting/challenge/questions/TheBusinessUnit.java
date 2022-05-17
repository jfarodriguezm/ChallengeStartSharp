package com.choucairtesting.challenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheBusinessUnit implements Question<Boolean> {

    private String question;

    public TheBusinessUnit(String question){
        this.question = question;
    }

    public static TheBusinessUnit isAlreadyCreate(String question) {
        return new TheBusinessUnit(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String businessUnit = Text.of(Target.the("business units table")
                .located(By.xpath("//a[contains(text(),'"+question+"')]"))).viewedBy(actor).asString();
        if(question.equals(businessUnit)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
