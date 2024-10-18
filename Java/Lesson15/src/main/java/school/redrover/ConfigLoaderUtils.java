package school.redrover;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ConfigLoaderUtils {

    // Метод для загрузки тестовых данных
    public static UserData loadUserData(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), UserData.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Метод для загрузки настроек браузера
    public static BrowserConfig loadBrowserConfig(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), BrowserConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
