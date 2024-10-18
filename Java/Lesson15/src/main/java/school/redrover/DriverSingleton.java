package school.redrover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverSingleton {

    private static WebDriver driver;
    private static BrowserConfig config;

    private DriverSingleton() {}

    // Метод для загрузки конфигурации из JSON
    private static BrowserConfig loadConfig() {
        if (config == null) {
            config = ConfigLoaderUtils.loadBrowserConfig("src/main/resources/BrowserConfig.json");  // путь к файлу конфигурации
        }
        return config;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            BrowserConfig browserConfig = loadConfig();

            if ("chrome".equalsIgnoreCase(browserConfig.getBrowser())) {
                ChromeOptions options = new ChromeOptions();

                // Применение аргументов из конфигурации
                for (String arg : browserConfig.getArguments()) {
                    options.addArguments(arg);
                }

                // Применение режима headless, если указано
                if (browserConfig.isHeadless()) {
                    options.addArguments("--headless");
                }

                driver = new ChromeDriver(options);

            } else if ("firefox".equalsIgnoreCase(browserConfig.getBrowser())) {
                FirefoxOptions options = new FirefoxOptions();

                // Применение аргументов из конфигурации
                for (String arg : browserConfig.getArguments()) {
                    options.addArguments(arg);
                }

                // Применение режима headless, если указано
                if (browserConfig.isHeadless()) {
                    options.addArguments("--headless");
                }

                driver = new FirefoxDriver(options);
            } else {
                throw new RuntimeException("Unsupported browser: " + browserConfig.getBrowser());
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
