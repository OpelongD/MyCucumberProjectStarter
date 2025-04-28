package FleetPageObjects;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

import static java.util.Objects.requireNonNull;
import static net.serenitybdd.core.Serenity.getDriver;

public class FleetCreateOrderPage extends PageObjects {


    // Login IN elements

    String Url = "https://korridor.crownsoftware.co.za/";
    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String RememberMeXpath = "//input[@type='checkbox']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";
    String DashboardUrl = "https://korridor.crownsoftware.co.za/Home/Index";

    // Landing Page Elements
    String TenantDropXpath = "//select[@name='tenantId']";

    // New Order Elements
    String CreateOrderButtonXpath = "//a[@href='/Order/Create']";
    String OrderIdXpath = "//input[@placeholder='Order Id...']";
    String PONumberXpath = "//input[@placeholder='PO Number...']";
    String OrderXpath1 = "//a[@href='/Order']";

    String ProductDesXpath = "//input[@placeholder='Product Desc...']";
    String SelectDelTypeXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[4]/div/select";
    String QTYXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[5]/div/input";
    String SlotTimeXpath = "//*[@id=\"SlotTime\"]";

    public FleetCreateOrderPage(WebDriver driver) {
        super(driver);
    }


    // Action Login Tests

    @Step("User access TMS Website")
    public void TMSWebsite() {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
    }

    @Step("User captures valid Login Credentials")
    public void LogIn(String UserName, String Password) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserNameXpath))).sendKeys(UserName);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PasswordXpath))).sendKeys(Password);
    }


    @Step("User clik RememberMeRadioButton")
    public void RememberMe() {
        requireNonNull(getDriver().findElement(By.xpath(RememberMeXpath))).click();

    }

    private WebElement $(By xpath) {
        return null;
    }

    @Step("User click LoginButton")
    public void ClickLogin() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginButtonXpath))).click();

        // Validate redirect to dashboard
        wait.until(ExpectedConditions.urlToBe(DashboardUrl));
        assert getDriver().getCurrentUrl().equals(DashboardUrl) : "User was not redirected to dashboard page";

    }


    @Step("User select demo on Tenent drop list")
    public void SelectDemo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement demo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(TenantDropXpath)));
        Select selectObject = new Select(demo);
        selectObject.selectByValue("1");

        // Validate Demo Tenant is selected
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='tenantId']//option[@value='1']")));
        assert getDriver().findElement(By.xpath("//select[@name='tenantId']//option[@value='1']")).isSelected() : "Demo Tenant was not selected";
    }

    // New Order Methods

    @Step("Click Order")
    public void Order() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement Order = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath1)));
        Order.click();

        // Validate Order Page is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/Order']")));
        assert getDriver().findElement(By.xpath("//a[@href='/Order']")).isDisplayed() : "Order Page was not displayed";
    }

    public void CreateOrder() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement Order = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OrderXpath1)));
        Order.click();

        // Validate Create Order Page is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/Order/Create']")));
        assert getDriver().findElement(By.xpath("//a[@href='/Order/Create']")).isDisplayed() : "Create Order Page was not displayed";
    }

    public void EnterOrderId(String s) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement OrderIdTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OrderIdXpath)));
        OrderIdTxt.sendKeys("OrderId 1st");
    }

    public void EnterPONumber(String s) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement PONumberTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PONumberXpath)));
        PONumberTxt.sendKeys("PO Number 1st");
    }

    public void SelectCustomer(String s) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement Customer = $(By.xpath("//div[@id='devextreme0']//div[@role='combobox'][normalize-space()='Select...']"));
        assert Customer != null;
        Customer.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dx-item-content dx-list-item-content']")));
        WebElement firstCustomerOption = $(By.xpath("//div[@class='dx-item-content dx-list-item-content']")); // Select the first item
        assert firstCustomerOption != null;
        firstCustomerOption.click();
    }

    public void SelectRoute(String s) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        WebElement txtfield = $(By.xpath("//div[contains(text(),'Select...')]"));
        assert txtfield != null;
        txtfield.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"devextreme0\"]/div[1]/div[1]")));
        WebElement routeOption = $(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='000001 - Zinja Mguni']")); // Replace 'Customer Name' with the actual name
        assert routeOption != null;
        routeOption.click();
    }

    public void SelectProduct(String s) throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//
//        WebElement ClicktxtProduct = $(By.xpath("//select[@title='Product']"));
//        ClicktxtProduct.click();Thread.sleep(1000);


        Thread.sleep(1000);
        WebElement ClicktxtProduct = $(By.xpath("//select[@title='Product']"));
        Select selectObjectP = new Select(requireNonNull(ClicktxtProduct));
        selectObjectP.selectByValue("5");
    }

    public void enterProductDesc(String description) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ProductDesXpath)));
        element.sendKeys(description);
    }

    public void SelectDeliveryType(String deliveryType) throws InterruptedException {
        //Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(SelectDelTypeXpath));
        Select selectObjectD = new Select(requireNonNull(dropList1));
        selectObjectD.selectByValue("6");
    }

    public void EnterQuantity(String number) throws InterruptedException {
        //Thread.sleep(1000);

        // replace with the actual locator
        WebElement textField = $(By.xpath(QTYXpath));

        // Click on the text field
        textField.click();

        // Clear any existing text in the field
        textField.clear();

        // Send keys to the textfield3

        textField.sendKeys("20");

//        $(By.xpath(QTYXpath)).sendKeys("20");
    }

    public void EnterSlotTime(String slotTime) {
        $(By.xpath(SlotTimeXpath)).sendKeys("00:00");
    }

    public void ClickSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement SaveButton01 = $(By.xpath("//*[@id=\"uberForm\"]/section[1]/div/input"));
        assert SaveButton01 != null;
        SaveButton01.click();
        //Thread.sleep(1000);
    }

//    public void CLICKEDIT() throws InterruptedException {
//        Thread.sleep(2000);
//
//        WebElement EditButton = $(By.xpath("//*[@id=\"edit\"]"));
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true)", EditButton);
//        assert EditButton != null;
//        EditButton.click();
//    }
//
//    public void AuthClick() throws InterruptedException {
//        Thread.sleep(1000);
//        WebElement AuthButton = $(By.xpath("//input[@value='Authorise']"));
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true)", AuthButton);
//        assert AuthButton != null;
//        AuthButton.click();
//    }


}
