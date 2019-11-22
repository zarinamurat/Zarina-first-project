package com.project.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Saule
 *
 * 
 */
public class ConfigReader {
    private static Properties properties;

    static {
        try {
            String path = "./src/test/resources/testData/config.properties";
            FileInputStream stream = new FileInputStream(path);

            properties = new Properties();
            properties.load(stream);

            stream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) { return properties.getProperty(key); }
}

