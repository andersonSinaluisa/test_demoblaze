package org.andersonsinaluisa.demoblaze.interactions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target NAME_PRODUCT
            = Target.the("Name Product").locatedBy("//*[@id=\"tbodyid\"]/tr/td[starts-with(text(),'{0}')]]");
    public static final Target PAY_BUTTON = Target.the("Pay Button").locatedBy("//button[starts-with(text(),'Play Order')]");


    public static final Target INPUT_NAME = Target.the("Input Name").located(By.id("name"));

    public static final Target INPUT_COUNTRY = Target.the("Input Country").located(By.id("country"));

    public static final Target INPUT_CITY = Target.the("Input City").located(By.id("city"));

    public static final Target INPUT_CREDIT_CARD = Target.the("Input Credit Card").located(By.id("card"));

    public static final Target INPUT_MONTH = Target.the("Input Month").located(By.id("month"));

    public static final Target INPUT_YEAR = Target.the("Input Year").located(By.id("year"));

}
