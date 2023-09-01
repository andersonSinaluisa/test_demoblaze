package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    public static final Target PHONE = Target.the("Phone").locatedBy("//a[starts-with(text(),'Phone')]");
    public static final Target LAPTOP = Target.the("Laptop").locatedBy("//a[starts-with(text(),'Laptop')]");

    public static final Target MONITORS = Target.the("Monitors").locatedBy("//a[starts-with(text(),'Monitors')]");

    public static final Target NAV_HOME = Target.the("Home").locatedBy("//a[starts-with(text(),'Home ')]");

    public static final Target NAV_CART = Target.the("Cart").locatedBy("//a[starts-with(text(),'Cart')]");
}
