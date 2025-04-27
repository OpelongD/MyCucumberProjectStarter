package FleetPageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FleetContract extends PageObject {

    String ContractXpath = "(//span[normalize-space()='Contracts'])[1]";
    String AddContractXpath = "(//a[normalize-space()='Add Contract'])[1]";


    // Contract Details

    String NameXpath = "(//input[@id='name'])[1]";
    String DeliveryXpath = "(//select[@title='DeliveryType'])[1]";
    String StartOnXpath = "(//input[@id='StartsOn'])[1]";
    String EndOnXpath = "(//input[@id='EndsOn'])[1]";
    String EvarageLoadXpath = "(//input[@placeholder='Average Load...'])[1]";
    String NUmberLoadXpath = "(//input[@placeholder='Number of Loads...'])[1]";
    String TripRequiredXpath = "(//input[@placeholder='Trips Required...'])[1]";
    String ReferenceXpath = "(//input[@placeholder='Reference Number...'])[1]";
    String ContractCurrencyXpath = "(//select[@title='ContractCurrency'])[1]";
    String ContractValueXpath = "(//input[@placeholder='Contract Value...'])[1]";
    String NotesXpath = "(//input[@placeholder='Notes...'])[1]";
    String CustomerXpath = "(//select[@title='CustomerId'])[1]";
    String PaymentTermXpath = "(//select[@title='PaymentTermId'])[1]";
    String ProductXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[15]/select";
    String ProductDescriptXpath = "(//input[@placeholder='Product Description...'])[1]";
    String RouteXpath = "(//select[@title='RouteId'])[1]";
    String SaveXpath = "(//input[@value='Save'])[1]";

    // Contract Methods

    @Step("ClickContract")
    public void Contract() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement Contract = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ContractXpath)));
        Contract.click();
    }

    public void ClickAddContract() {
        $(AddContractXpath).click();
    }

    // Add Contract Details

    public void EnterName(String s) {
        $(NameXpath).sendKeys("Contract A");
    }

    public void SelectDelivery(String s) {
        //$(DeliveryXpath).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement delivery01 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryXpath)));
        Select selectObject = new Select(delivery01);
        selectObject.selectByValue("1");
    }

    public void EnterStartOn(String s) {
        $(StartOnXpath).sendKeys("2025-03-09");
    }

    public void EnterEndOn(String s) {
        $(EndOnXpath).sendKeys("2025-03-09");
    }

    public void EnterEvarageLoad(String s) {
        $(EvarageLoadXpath).sendKeys("5");
    }

    public void EnterNUmberLoad(String s) {
        $(NUmberLoadXpath).sendKeys("10");
    }

    public void EnterTripRequired(String s) {
        $(TripRequiredXpath).sendKeys("2");
    }

    public void EnterReference(String s) {
        $(ReferenceXpath).sendKeys("Test01");
    }

    public void SelectContractCurrency(String s) {
        // $(ContractCurrencyXpath).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement delivery01 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryXpath)));
        Select selectObject = new Select(delivery01);
        selectObject.selectByValue("AOA");
    }

    public void EnterContractValue(String s) {
        $(ContractValueXpath).sendKeys("10");
    }

    public void EnterNotes(String s) {
        $(NotesXpath).sendKeys("Ishmael Direro");
    }

    public void SelectCustomer(String s) {
        //$(CustomerXpath).click();

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement delivery01 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryXpath)));
        Select selectObject = new Select(delivery01);
        selectObject.selectByValue("1");
    }

    public void SelectPaymentTerm(String s) {
        $(PaymentTermXpath).sendKeys("Cash in advance");
    }

    //    public  void SelectProduct(String s) {
//        $(ProductXpath).click();
//    }
    public void EnterProductDescript(String s) {
        $(ProductDescriptXpath).sendKeys("Testing");
    }

    public void SelectRoute(String s) {
        // $(RouteXpath).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement delivery01 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryXpath)));
        Select selectObject = new Select(delivery01);
        selectObject.selectByValue("1");

    }

    public void ClickSave() {
        $(SaveXpath).click();

    }


}
