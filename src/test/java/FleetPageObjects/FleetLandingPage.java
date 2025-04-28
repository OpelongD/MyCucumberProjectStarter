package FleetPageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class FleetLandingPage extends PageObject {

    // Landing Page Elements
    String TenantDropXpath = "//select[@name='tenantId']";

    //Landing Page Methods

    @Step("User select Tenant")
    public void selectTenant() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement tenant = getDriver().findElement(By.xpath(TenantDropXpath));
        Select selectTenant = new Select(tenant);
        selectTenant.selectByValue("1");

        // Validate Demo Tenant is selected
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='tenantId']//option[@value='1']")));
        assert getDriver().findElement(By.xpath("//select[@name='tenantId']//option[@value='1']")).isSelected() : "Demo Tenant was not selected";
    }
    }



