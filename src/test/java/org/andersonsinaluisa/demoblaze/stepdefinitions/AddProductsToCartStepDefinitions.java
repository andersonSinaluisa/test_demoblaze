package org.andersonsinaluisa.demoblaze.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.andersonsinaluisa.demoblaze.interactions.CartPage;
import org.andersonsinaluisa.demoblaze.interactions.HomePage;
import org.andersonsinaluisa.demoblaze.tasks.AddProductToCart;
import org.andersonsinaluisa.demoblaze.tasks.GoToCart;
import org.andersonsinaluisa.demoblaze.tasks.GoToHome;
import org.andersonsinaluisa.demoblaze.tasks.SearchProduct;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class AddProductsToCartStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver theBrowser;
    private Actor actor = Actor.named("Anderson");
    private HomePage homePage = new HomePage();
    private SearchProduct searchProduct;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {

        actor.can(BrowseTheWeb.with(theBrowser));
        actor.wasAbleTo(Open.browserOn(homePage));
    }
    @When("^the user adds the first product (.*), (.*) to the cart$")
    public void theUserAddsTheFirstProductToTheCart(String typeProduct,String nameProduct) {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(SearchProduct.withDescripcion(typeProduct,nameProduct));
        actor.wasAbleTo(AddProductToCart.add());
        actor.wasAbleTo(GoToHome.go());

    }
    @When("^the user adds the second product (.*), (.*) to the cart$")
    public void theUserAddsTheSecondProductToTheCart(String typeProduct,String nameProduct) {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(SearchProduct.withDescripcion(typeProduct,nameProduct));
        actor.wasAbleTo(AddProductToCart.add());
    }

    @When("the user adds the first product to the cart")
    public void theUserAddsTheFirstProductToTheCart(DataTable data) {
        // Write code here that turns the phrase above into concrete actions
        List<String> listData = data.row(0);
        actor.wasAbleTo(SearchProduct.withDescripcion(listData.get(0),listData.get(1)));
        actor.wasAbleTo(AddProductToCart.add());
        actor.wasAbleTo(GoToHome.go());
    }

    //the user adds the second product to the cart
    @When("the user adds the second product to the cart")
    public void theUserAddsTheSecondProductToTheCart(DataTable data) {
        // Write code here that turns the phrase above into concrete actions
        List<String> listData = data.row(0);
        actor.wasAbleTo(SearchProduct.withDescripcion(listData.get(0),listData.get(1)));
        actor.wasAbleTo(AddProductToCart.add());
    }
    @Then("the user should see that the products are in the cart")
    public void theUserShouldSeeThatTheProductsAreInTheCart() {
        // Write code here that turns the phrase above into concrete actions
        actor.wasAbleTo(GoToCart.go());
        actor.should(seeThat(the(CartPage.NAME_PRODUCT),isPresent()));
    }

}
