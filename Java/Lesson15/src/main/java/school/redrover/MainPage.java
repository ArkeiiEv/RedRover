package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By userFormLocator = By.id("userForm");
    private By inputFieldNameLocator = By.id("userName");
    private By inputFieldEmailLocator = By.id("userEmail");
    private By inputFieldAddressLocator = By.id("currentAddress");
    private By inputFieldPerAddressLocator = By.id("permanentAddress");
    private By submitButtonLocator = By.id("submit");
    private By resultFieldLocator = By.id("output");
    private By resultNameLocator = By.xpath("//*[@id='name']");
    private By resultEmailLocator = By.id("email");
    private By resultCurrentAddressLocator = By.xpath("//p[@id='currentAddress']");
    private By resultPermanentAddressLocator = By.xpath("//p[@id='permanentAddress']");

    // Конструктор
    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public WebElement getUserForm() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(userFormLocator));
    }

    private WebElement getInputFieldName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldNameLocator));
    }

    private WebElement getInputFieldEmail() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldEmailLocator));
    }

    private WebElement getInputFieldAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldAddressLocator));
    }

    private WebElement getInputFieldPerAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inputFieldPerAddressLocator));
    }

    private WebElement getSubmitButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(submitButtonLocator));
    }

    public void submitUserForm(String name, String email, String currentAddress, String permanentAddress) {
        getInputFieldName().sendKeys(name);
        getInputFieldEmail().sendKeys(email);
        getInputFieldAddress().sendKeys(currentAddress);
        getInputFieldPerAddress().sendKeys(permanentAddress);
        getSubmitButton().click();
    }

    public WebElement getResultField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultFieldLocator));
    }

    private WebElement getResultName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultNameLocator));
    }

    private WebElement getResultEmail() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultEmailLocator));
    }

    private WebElement getResultCurrentAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultCurrentAddressLocator));
    }

    private WebElement getResultPermanentAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultPermanentAddressLocator));
    }

    // Проверка совпадения данных
    boolean isDataSame(String name, String email, String currentAddress, String permanentAddress) {
        return getResultName().getText().equals(name) &&
                getResultEmail().getText().equals(email) &&
                getResultCurrentAddress().getText().equals(currentAddress) &&
                getResultPermanentAddress().getText().equals(permanentAddress);
    }
}

