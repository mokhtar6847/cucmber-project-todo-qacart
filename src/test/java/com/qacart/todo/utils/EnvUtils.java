package com.qacart.todo.utils;

import java.io.IOException;
import java.util.Properties;

public class EnvUtils {
    public static EnvUtils envUtils;
    private Properties prop;

    private EnvUtils() throws IOException {
        String env = System.getProperty("env", "STAGING");

        switch(env){
            case "PRODUCTION" -> {
                prop = ConfigUtils.readConfig("src/test/resources/properties/production.properties");
            }

            case "STAGING" -> {
                prop = ConfigUtils.readConfig("src/test/resources/properties/staging.properties");
            }

            case "LOCAL" -> {
                prop = ConfigUtils.readConfig("src/test/resources/properties/local.properties");
            }

            default -> {
                throw new RuntimeException("File is not found");
            }
        }
    }

    public static EnvUtils getInstance() throws IOException {
        envUtils = new EnvUtils();
        return envUtils;
    }

    public Object getURL(){
        return prop.get("URL");
    }

    public Object getEmail(){
        return prop.get("EMAIL");
    }

    public Object getPASSWORD(){
        return prop.get("PASSWORD");
    }

}
