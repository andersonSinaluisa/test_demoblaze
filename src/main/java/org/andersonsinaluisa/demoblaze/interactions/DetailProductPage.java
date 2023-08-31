package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetailProductPage {

    public static final Target ADD_TO_CART
            = Target.the("Add to cart").located(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4"));
}
