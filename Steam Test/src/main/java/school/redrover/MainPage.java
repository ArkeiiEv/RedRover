package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    // Конструктор
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Локатор для панели популярных товаров
    private By popularPanelLocator = By.xpath("//*[@id='responsive_page_template_content']/div[3]/div[2]/div[6]");
    private By gutterHomePage = By.xpath("//*[@id='responsive_page_template_content']/div[3]/div[1]/div/div[2]");

    // Метод для поиска панели популярных товаров
    public WebElement getPopularPanel() {
        return driver.findElement(popularPanelLocator);
    }
    public WebElement getGutterHomePage() {
        return driver.findElement(gutterHomePage);
    }
}