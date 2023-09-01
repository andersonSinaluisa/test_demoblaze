package org.andersonsinaluisa.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.andersonsinaluisa.demoblaze.interactions.CartPage;
import org.andersonsinaluisa.demoblaze.model.Person;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PayOrder implements Task {

    private Person person;

    public PayOrder(Person person) {
        this.person = person;
    }

    public static Performable withData(Person person) {
        return instrumented(PayOrder.class, person);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.PAY_BUTTON)
        );
        actor.attemptsTo(
                //write in the input name
                Enter.theValue(person.getName()).into(CartPage.INPUT_NAME)

        );


    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
