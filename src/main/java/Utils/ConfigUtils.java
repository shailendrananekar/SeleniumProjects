package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigUtils {

    private static ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    static Properties config;
    private static Logger Log = Logger.getLogger(ConfigUtils.class.getName());

    public static void loadConfig() {

        try {
            FileInputStream fileInput = new FileInputStream(classLoader.getResource("config.properties").getFile());
            config = new Properties();
            config.load(fileInput);
            fileInput.close();
        } catch (IOException ex) {
            Log.info("Exception reading onfig: " + ex);
        }
    }

    public static String getConfigValue(String key) {

        return config.getProperty(key);
    }
}
