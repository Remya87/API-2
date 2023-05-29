package Testscenarios;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties;

    static {
        String propertyFilePath = "src/test/resources/petstore.properties"; 

        try {
            properties = new Properties();
            File file = new File(propertyFilePath);
            FileInputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("baseurl");
    }
}