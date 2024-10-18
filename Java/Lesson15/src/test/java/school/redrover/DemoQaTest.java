package school.redrover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNotNull;

public class DemoQaTest {
    private MainPage mainPage;
    private static WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.get("https://demoqa.com/text-box");
        mainPage = new MainPage(driver);
    }

    @Test
    public void testMainPageIsOpen() {
        Assert.assertNotNull(mainPage.getUserForm());
    }

    @Test
        public void testUserFormFill() {
        mainPage.submitUserForm("Alex", "churva@dsad.com", "Bobr", "Mog");
        Assert.assertTrue(mainPage.getResultField().isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        DriverSingleton.quitDriver();
    }

}
