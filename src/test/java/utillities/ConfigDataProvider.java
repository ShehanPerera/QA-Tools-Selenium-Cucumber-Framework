package utillities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

    Properties properties;

    public ConfigDataProvider() {
        String projectLocation = System.getProperty("user.dir");
        String confFile = projectLocation + "/config/config.properties";
        try {
            File conf = new File(confFile);
            FileInputStream fileInputStream = new FileInputStream(conf);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println();
        }

    }

    public String getBrowser() {
        return properties.getProperty("Browser");
    }
    public String getSearchText() {
        return properties.getProperty("SearchText");
    }
    public String getVerifyMessage() {
        return properties.getProperty("VerifyMessage");
    }
    public boolean getHeaded() {
        return Boolean.parseBoolean(properties.getProperty("Headed"));
    }

}
