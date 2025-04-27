package FleetStepsDefinitions;

import FleetLoginPage.FleetLoginCapture;
import FleetPageObjects.FleetCreateOrderPage;


import FleetPageObjects.FleetLandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FleetOderCreateSteps extends PageObject {

    // Add Annotations for the Steps
    @Steps
    FleetLoginCapture fleetLoginCapture;
    @Steps
    FleetCreateOrderPage fleetCreateOrderPage;
    @Steps
    FleetLandingPage fleetLandingPage;

    @Steps

    @Given("User has valid data to create an order")
    public void user_has_valid_data_to_create_an_order() {
        fleetLoginCapture.TMSWebsite();
        fleetLoginCapture.LogIn("ishmael.direro@korridor.com", "Ish@cyest#982");
        fleetLoginCapture.RememberMe();
        fleetLoginCapture.ClickLogin();
    }

    @Given("User navigates to the Dashboard page")
    public void user_navigates_to_the_dashboard_page() {
        fleetLandingPage.selectTenant();

    }

    @Given("User clicks the Create Order button")
    public void user_clicks_the_create_order_button() {
        fleetCreateOrderPage.CreateOrder();
    }

    @Given("User fills in the Order Information with: {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}")
    public void user_fills_in_the_order_information_with(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks the Save button")
    public void user_clicks_the_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User navigates to Edit mode")
    public void user_navigates_to_edit_mode() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks the Authorize button")
    public void user_clicks_the_authorize_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
