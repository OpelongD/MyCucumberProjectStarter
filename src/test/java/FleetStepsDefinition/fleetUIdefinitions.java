package FleetStepsDefinition;

import FleetPageObjects.FleetCreateOrderPage;
import FleetPageObjects.FleetLandingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class fleetUIdefinitions extends PageObject {

    @Steps
    FleetCreateOrderPage fleetCreateOrderPage;
    @Steps
    FleetLandingPage fleetLandingPage;

    @Given("User has valid data to create an order")
    public void user_has_valid_data_to_create_an_order() {
        fleetCreateOrderPage.TMSWebsite();
        fleetCreateOrderPage.LogIn("ishmael.direro@korridor.com", "Ish@cyest#982");
        fleetCreateOrderPage.RememberMe();
        fleetCreateOrderPage.ClickLogin();

    }

    @Then("User navigates to the Dashboard page")
    public void user_navigates_to_the_dashboard_page() {
        fleetLandingPage.selectTenant();
        fleetCreateOrderPage.Order();
    }

    @And("User clicks the Create Order button")
    public void user_clicks_the_create_order_button() {
        fleetCreateOrderPage.CreateOrder();
        fleetCreateOrderPage.EnterOrderId("OrderId 1st");
    }

    @When("User fills in the Order Information with: {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}")
    public void user_fills_in_the_order_information_with(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
        fleetCreateOrderPage.EnterOrderId("OrderId 1st");
        fleetCreateOrderPage.SelectCustomer("SIM001 - Simone Sims");
        fleetCreateOrderPage.SelectRoute("000001 - Zinja Mguni");
        fleetCreateOrderPage.SelectProduct("Product");
        fleetCreateOrderPage.enterProductDesc("Testing");
        fleetCreateOrderPage.SelectDeliveryType("DeliveryType");
        fleetCreateOrderPage.EnterQuantity("20");
        fleetCreateOrderPage.EnterSlotTime("00:00");
    }

    @Then("User click SaveButton")
    public void SaveButton() throws InterruptedException {
        fleetCreateOrderPage.ClickSaveButton();
    }
}




