package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListProductsPage {

    public static final Target NAME_PRODUCT_LINKS
            = Target.the("Name Product").located(By.className("hrefch"));
   public static final Target NAME_PRODUCT = Target.the("Name Product").locatedBy("//a[starts-with(text(), '{0}')]");
}
