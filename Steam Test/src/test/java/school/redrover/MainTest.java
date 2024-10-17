package school.redrover;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    private static WebDriver driver;
    private static MainPage mainPage;

    @BeforeAll
    public static void setUp() {
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

    @AfterAll
    public static void tearDown() {
        // Завершаем работу драйвера
        DriverSingleton.quitDriver();
    }
}