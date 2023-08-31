package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    public static final Target PHONE = Target.the("Phone").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
    public static final Target LAPTOP = Target.the("Laptop").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));

    public static final Target MONITORS = Target.the("Monitors").located(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));

}
