package school.redrover;

import java.util.List;

public class BrowserConfig {
    private String browser;
    private boolean headless;
    private List<String> arguments;

    // Геттеры и сеттеры
    public String getBrowser() {
        return browser;
    }

    public boolean isHeadless() {
        return headless;
    }

    public List<String> getArguments() {
        return arguments;
    }
}
