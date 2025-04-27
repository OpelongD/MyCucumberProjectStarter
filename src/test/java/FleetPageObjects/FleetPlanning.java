package FleetPageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class FleetPlanning extends PageObject {


    // Login IN elements
    String Url = "https://korridor.crownsoftware.co.za/";
    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String RememberMeXpath = "//input[@type='checkbox']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";


    // Landing Page Elements
    String TenantDropXpath = "//select[@name='tenantId']";


    //Trip Planning Elements

    String PlanningXpath = "(//span[normalize-space()='Planning'])[1]";
    String PlanXpath = "(//a[normalize-space()='Plan'])[1]";
    String AddTripXpath = "//*[@id=\"app\"]/div[1]/div[1]/div[2]/a";
    String AddRouteXpath = "(//div[@id='AddRouteModal'])[1]";
    String Routetxt = "(//input[@type='search'])[1]";
    String SelectRouteXpath = "(//span[@class='vs__selected'])[1]";
    String PONumberXpath = "(//input[@type='search'])[1]";
    String RepeatXoath = "(//input[@id='repeatTrip'])[1]";
    String TripButton = "(//button[normalize-space()='Add Trip'])[1]";

    // I can use javascript to simulate drag & drop
    String VehicleDrag = "(//b[normalize-space()='000001 - FV61LN'])[1]";
    String TripSaveButton = "(//input[@value='Save'])[1]";

    // Trip Planning Action & Methods

    @Step("User has OpenWebsite and logged in with valid Credentials")
    public void loggedIn() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
    }

    @Step("USer is direct to dashboard")
    public void dashboard() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement tenant = getDriver().findElement(By.xpath(TenantDropXpath));
        Select selectTenant = new Select(tenant);
        selectTenant.selectByValue("1");
    }

    @Step("User click Planning")
    public void planning() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement planning = getDriver().findElement(By.xpath(PlanningXpath));
        planning.click();
    }

    @Step("User click Plan Button")
    public void plan() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement plan = getDriver().findElement(By.xpath(PlanXpath));
        plan.click();
    }

    @Step("USer click Add Trip Button")
    public void addTrip() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement addTrip = getDriver().findElement(By.xpath(AddTripXpath));
        addTrip.click();
    }

    @Step("User select Route")
    public void selectRoute() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement selectRoute = getDriver().findElement(By.xpath("//*[@id=\"vs1__combobox\"]/div[1]/input"));

        Select selectObject = new Select(selectRoute);
        selectObject.getFirstSelectedOption();
    }

    @Step("User capture PO Number")
    public void capturePONumber() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement PONUMBER = getDriver().findElement(By.xpath("//*[@id=\"poNumber\"]"));
        PONUMBER.sendKeys("10111");
    }

    @Step("User enter repeat")
    public void repeat() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement rep = getDriver().findElement(By.xpath(RepeatXoath));
        rep.click();
        rep.clear();
        rep.sendKeys("10111");
    }

    @Step("User Click TripAddButton")
    public void addButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement addButton = getDriver().findElement(By.xpath(TripButton));
        addButton.click();
    }

    // User should be able to drag & drop vehicle onto the trip added

    //Implement Javascript for Drag and Drop Method/Action

    //User move the mouse to vehicle, Click to drag and drop on top on route name

    @Step("USer DRAG AND DROP VEHICLE ONTO TRIP")
    public void dropVehicleOntoTrip() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }


}
