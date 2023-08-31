package org.andersonsinaluisa.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Link;
import org.andersonsinaluisa.demoblaze.interactions.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProduct implements Task {

    private String typeProduct;
    private String nameProduct;
    public SearchProduct(String typeProduct,String nameProduct) {
        this.typeProduct = typeProduct;
        this.nameProduct = nameProduct;
    }
    public static Performable withDescripcion(String typeProduct,String nameProduct) {
        return instrumented(SearchProduct.class,typeProduct,nameProduct);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (typeProduct){
            case "PHONE":
                actor.attemptsTo(
                        Click.on(HomePage.PHONE)
                );
                break;
            case "LAPTOP":
                actor.attemptsTo(
                        Click.on(HomePage.LAPTOP)
                );
                break;

            case "MONITOR":
                actor.attemptsTo(
                        Click.on(HomePage.MONITORS)
                );
                break;
        }

        actor.attemptsTo(
                //<a href="prod.html?idp_=1" class="hrefch">Samsung galaxy s6</a>
                Click.on(Link.withCSSClass("hrefch").containingText(nameProduct))
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
