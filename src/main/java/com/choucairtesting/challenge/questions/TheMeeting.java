package com.choucairtesting.challenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheMeeting implements Question<Boolean> {

    private String question;

    public TheMeeting(String question){
        this.question = question;
    }

    public static TheMeeting isAlreadyCreate(String question) {
        return new TheMeeting(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String meeting = Text.of(Target.the("meetings table")
                .located(By.xpath("//a[contains(text(),'"+question+"')]"))).viewedBy(actor).asString();
        if(question.equals(meeting)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
