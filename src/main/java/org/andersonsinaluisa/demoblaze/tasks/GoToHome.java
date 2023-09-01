package org.andersonsinaluisa.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.andersonsinaluisa.demoblaze.interactions.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToHome implements Task {

    public static Performable go() {
        return instrumented(GoToHome.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(HomePage.NAV_HOME)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
