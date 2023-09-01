package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class DetailProductPage {

    public static final Target ADD_TO_CART
            = Target.the("Add to cart").locatedBy("//a[starts-with(text(), 'Add to cart')]");
}
