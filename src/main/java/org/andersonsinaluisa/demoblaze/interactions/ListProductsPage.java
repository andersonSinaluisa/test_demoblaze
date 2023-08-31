package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListProductsPage {

    public static final Target NAME_PRODUCT
            = Target.the("Name Product").located(By.cssSelector("#hrefch"));
}
