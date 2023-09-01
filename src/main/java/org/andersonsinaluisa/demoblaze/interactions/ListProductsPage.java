package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.screenplay.targets.Target;

public class ListProductsPage {

    public static final Target NAME_PRODUCT
            = Target.the("Name Product").locatedBy("//a[starts-with(text(),'{0}')]");
}
