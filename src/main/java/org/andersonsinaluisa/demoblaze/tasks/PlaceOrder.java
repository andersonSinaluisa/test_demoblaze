package org.andersonsinaluisa.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.andersonsinaluisa.demoblaze.interactions.CartPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PlaceOrder  implements Task {

    public static Performable go() {
        return instrumented(PlaceOrder.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.PAY_BUTTON)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
