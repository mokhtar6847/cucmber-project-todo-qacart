package com.qacart.todo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.util.Properties;

public class ConfigUtils {
    public static Properties readConfig(String path) throws IOException {
        File propFile = new File(path);
        FileInputStream is = new FileInputStream(propFile);
        Properties prop = new Properties();
        prop.load(is);
        is.close();
        return prop;
    }
}
