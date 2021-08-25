package com.training.java.properties;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertReaderEngine {

    public static <T> T readProp(final Object obj) throws Exception {
        Class<T> classLoc = (Class<T>) obj.getClass();
        PropFile propFileLoc = classLoc.getAnnotation(PropFile.class);
        if (propFileLoc != null) {
            String fileNameLoc = propFileLoc.value();
            File fileLoc = new File(fileNameLoc);
            FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
            Properties propertiesLoc = new Properties();
            propertiesLoc.load(fileInputStreamLoc);
            Field[] declaredFieldsLoc = classLoc.getDeclaredFields();
            for (Field fieldLoc : declaredFieldsLoc) {
                Prop propLoc = fieldLoc.getAnnotation(Prop.class);
                if (propLoc != null) {
                    fieldLoc.setAccessible(true);
                    String valueLoc = propLoc.value();
                    String propertyLoc = propertiesLoc.getProperty(valueLoc);
                    Class<?> typeLoc = fieldLoc.getType();
                    if (String.class.equals(typeLoc)) {
                        fieldLoc.set(obj,
                                     propertyLoc);
                    } else if (typeLoc.getName()
                                      .equals("int")) {
                        fieldLoc.setInt(obj,
                                        Integer.parseInt(propertyLoc));
                    } else if (Integer.class.equals(typeLoc)) {
                        fieldLoc.set(obj,
                                     Integer.parseInt(propertyLoc));
                    }
                }
            }
        }
        return (T) obj;
    }

}
