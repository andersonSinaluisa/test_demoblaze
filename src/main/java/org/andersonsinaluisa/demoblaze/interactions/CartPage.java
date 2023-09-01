package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target NAME_PRODUCT
            = Target.the("Name Product").located(By.className("success"));
    public static final Target PAY_BUTTON = Target.the("Pay Button").locatedBy("//button[starts-with(text(),'Place Order')]");


    public static final Target INPUT_NAME = Target.the("Input Name").located(By.id("name"));

    public static final Target INPUT_COUNTRY = Target.the("Input Country").located(By.id("country"));

    public static final Target INPUT_CITY = Target.the("Input City").located(By.id("city"));

    public static final Target INPUT_CREDIT_CARD = Target.the("Input Credit Card").located(By.id("card"));

    public static final Target INPUT_MONTH = Target.the("Input Month").located(By.id("month"));

    public static final Target INPUT_YEAR = Target.the("Input Year").located(By.id("year"));

    public static final Target PURCHASE_BUTTON = Target.the("Purchase Button").locatedBy("//button[starts-with(text(),'Purchase')]");

    public static final Target TEXT_SUCCESS_MODAL = Target.the("Text Success Modal").locatedBy("//h2[starts-with(text(),'Thank you for your purchase!')]");

}
