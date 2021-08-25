package com.training.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropReadRun {

    public static void main(final String[] args) {
        try {
            File fileLoc = new File("my.properties");
            FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
            Properties propertiesLoc = new Properties();
            propertiesLoc.load(fileInputStreamLoc);
            AppProp appPropLoc = new AppProp();

            appPropLoc.setName(propertiesLoc.getProperty("app.prop.name"));
            appPropLoc.setDetails(propertiesLoc.getProperty("app.prop.details"));
            appPropLoc.setSocketHost(propertiesLoc.getProperty("app.prop.socket.host"));
            appPropLoc.setSocketPort(Integer.parseInt(propertiesLoc.getProperty("app.prop.socket.port")));
            System.out.println(appPropLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        try {
            AppProp prop = PropertReaderEngine.readProp(new AppProp());
            System.out.println(prop);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
