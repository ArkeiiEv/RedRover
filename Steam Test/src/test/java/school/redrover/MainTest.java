package school.redrover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNotNull;

public class MainTest {

    private static WebDriver driver;
    private static MainPage mainPage;

    @BeforeClass
    public void setUp() {
        driver = DriverSingleton.getDriver();
        driver.get("https://store.steampowered.com");
        mainPage = new MainPage(driver);
    }

    @Test
    public void testPopularPanelPresence() {
        // Проверяем наличие панели популярных товаров
        WebElement popularPanel = mainPage.getPopularPanel();
        assertNotNull(popularPanel, "Популярная панель не найдена на странице");
    }

    @Test
    public void testGutterHomePage() {
        WebElement gutterHomePage = mainPage.getGutterHomePage();
        assertNotNull(gutterHomePage, "Error: gutterHomePage");
    }

    @AfterClass
    public void tearDown() {
        // Завершаем работу драйвера
        DriverSingleton.quitDriver();
    }
}