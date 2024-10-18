package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MainPage {
    private WebDriver driver;

    private By userFormLocator = By.id("userForm");
    private By inputFieldNameLocator = By.id("userName");
    private By inputFieldEmailLocator = By.id("userEmail");
    private By inputFieldAddressLocator = By.id("currentAddress");
    private By inputFieldPerAddressLocator = By.id("permanentAddress");
    private By submitButtonLocator = By.id("submit");
    private By resultFieldLocator = By.id("output");
    // Конструктор
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserForm(){
        return driver.findElement(userFormLocator);
    }

    private WebElement getInputFieldName(){
        return driver.findElement(inputFieldNameLocator);
    }

    private WebElement getInputFieldEmail(){
        return driver.findElement(inputFieldEmailLocator);
    }

    private WebElement getInputFieldAddress(){
        return driver.findElement(inputFieldAddressLocator);
    }

    private WebElement getInputFieldPerAddress(){
        return driver.findElement(inputFieldPerAddressLocator);
    }

    private WebElement getSubmitButton(){
        return driver.findElement(submitButtonLocator);
    }

    public void submitUserForm(String name, String email, String currentAddress, String permanentAddress){
        getInputFieldName().sendKeys(name);
        getInputFieldEmail().sendKeys(email);
        getInputFieldAddress().sendKeys(currentAddress);
        getInputFieldPerAddress().sendKeys(permanentAddress);
        getSubmitButton().click();
    }

    public WebElement getResultField(){
        return driver.findElement(resultFieldLocator);
    }




}

