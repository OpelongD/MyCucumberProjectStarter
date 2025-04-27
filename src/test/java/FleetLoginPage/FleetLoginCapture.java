package FleetLoginPage;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


import net.serenitybdd.screenplay.targets.Target;

public class FleetLoginCapture {

    // Login IN elements
    String Url = "https://korridor.crownsoftware.co.za/";
    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String RememberMeXpath = "//input[@type='checkbox']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";

    public FleetLoginCapture(WebDriver driver) {
        super();
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
        Objects.requireNonNull($(By.xpath(RememberMeXpath))).click();
    }

    private WebElement $(By xpath) {
        return null;
    }

    @Step("User click LoginButton")
    public void ClickLogin() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginButtonXpath))).click();
    }


}
