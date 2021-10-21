package com.dockerized.ui.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    protected Properties configProperties;
    protected String environmentConfig;
    protected String webDriverConfig;

    public Config() throws IOException {
        this.configProperties = new Properties();

        // Load target environment config file based on environment variable
        this.environmentConfig = System.getenv("AUTOMATED_TEST_ENV_CONFIG");
        String targetEnvConfigFilePath = "configuration/environment/" + this.environmentConfig + ".config.properties";
        this.loadPropertiesFile(targetEnvConfigFilePath);


        // Load target web-driver config file based on environment variable
        this.webDriverConfig = System.getenv("AUTOMATED_TEST_WD_CONFIG");
        String targetWdConfigFilePath = "configuration/webdriver/" + this.webDriverConfig  + ".config.properties";
        this.loadPropertiesFile(targetWdConfigFilePath);
    }

    private void loadPropertiesFile(String filepath) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(filepath).getFile());
        FileInputStream configFileInputStream = new FileInputStream(file);
        this.configProperties.load(configFileInputStream);
        configFileInputStream.close();
    }

    public String getProperty(String name) {
        return configProperties.getProperty(name);
    }
}
