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
        UserData testData = ConfigLoaderUtils.loadUserData("src/main/resources/TestData.json");
        Assert.assertNotNull(testData);
        String name = testData.getName();
        String email = testData.getEmail();
        String currentAddress = testData.getCurrentAddress();
        String permanentAddress = testData.getPermanentAddress();
        mainPage.submitUserForm(name, email, currentAddress, permanentAddress);
        Assert.assertTrue(mainPage.getResultField().isDisplayed());
    }

    /* Need Fix (don't how to fix);
    @Test
        public void testDataConsistency(){
        boolean isSame = mainPage.isDataSame("Alex", "churva@dsad.com", "Bobr", "Mog");
        Assert.assertTrue(isSame);

    }*/
    @AfterClass
    public void tearDown() {
        DriverSingleton.quitDriver();
    }

}
