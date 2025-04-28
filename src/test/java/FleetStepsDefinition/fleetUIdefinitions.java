package FleetStepsDefinition;

import FleetPageObjects.FleetCreateOrderPage;
import FleetPageObjects.FleetLandingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;

public class fleetUIdefinitions extends PageObject {

    // Adding annotations to the step definitions to inject the WebDriver object

    @Steps
    FleetCreateOrderPage fleetCreateOrderPage;
    @Steps
    FleetLandingPage fleetLandingPage;


    // Declared step definitions
    @Given("User has OpenWebsite and logged in with valid Credentials")
    public void user_has_open_website_and_logged_in_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("USer is direct to dashboard")
    public void u_ser_is_direct_to_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks the Order button")
    public void user_clicks_the_order_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks the Create Order button")
    public void user_clicks_the_create_order_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User fills in the Order Information with: {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}")
    public void user_fills_in_the_order_information_with(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User click SaveButton")
    public void user_click_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}




