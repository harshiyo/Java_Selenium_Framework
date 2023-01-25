package org.SeleniumFramework.Config;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private Properties prop = new Properties();
    private InputStream input = null;

    public ConfigReader() {
        try {
            input = new FileInputStream("src/main/java/org/SeleniumFramework/config.properties");
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}
