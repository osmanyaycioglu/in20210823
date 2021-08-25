package com.training.java.reflection;

import java.lang.reflect.Field;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

import com.training.java.annotations.GenerateValue;

public class ObjectCreator {

    public static <T> T create(final Class<T> clazz) throws Exception {
        T newInstanceLoc = clazz.newInstance();
        //        Method[] declaredMethodsLoc = clazz.getDeclaredMethods();
        //        Method declaredMethodLoc = clazz.getDeclaredMethod("");
        //        Parameter[] parametersLoc = declaredMethodLoc.getParameters();
        Field[] declaredFieldsLoc = clazz.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            GenerateValue myAnnoLoc = fieldLoc.getAnnotation(GenerateValue.class);
            if (myAnnoLoc != null) {
                fieldLoc.setAccessible(true);
                Class<?> typeLoc = fieldLoc.getType();
                String valLoc = myAnnoLoc.val();
                if (String.class.equals(typeLoc)) {
                    String stringLoc = null;
                    if (!valLoc.isEmpty()) {
                        stringLoc = valLoc;
                    } else {
                        stringLoc = UUID.randomUUID()
                                        .toString();
                    }
                    fieldLoc.set(newInstanceLoc,
                                 stringLoc);
                } else if (typeLoc.getName()
                                  .equals("int")) {
                    Random randomLoc = new SecureRandom();
                    int nextIntLoc = randomLoc.nextInt();
                    fieldLoc.setInt(newInstanceLoc,
                                    nextIntLoc);
                } else if (Integer.class.equals(typeLoc)) {
                    Random randomLoc = new SecureRandom();
                    int nextIntLoc = randomLoc.nextInt();
                    fieldLoc.set(newInstanceLoc,
                                 nextIntLoc);
                }
            }
        }
        return newInstanceLoc;
    }


    @SuppressWarnings("unchecked")
    public static <T> T createFromObj(final Object obj) throws Exception {
        Class<T> clazz = (Class<T>) obj.getClass();
        Field[] declaredFieldsLoc = clazz.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            GenerateValue myAnnoLoc = fieldLoc.getAnnotation(GenerateValue.class);
            if (myAnnoLoc != null) {
                fieldLoc.setAccessible(true);
                Class<?> typeLoc = fieldLoc.getType();
                String valLoc = myAnnoLoc.val();
                if (String.class.equals(typeLoc)) {
                    String curStrValLoc = (String) fieldLoc.get(obj);
                    if ((curStrValLoc == null) || curStrValLoc.isEmpty()) {
                        String stringLoc = null;
                        if (!valLoc.isEmpty()) {
                            stringLoc = valLoc;
                        } else {
                            stringLoc = UUID.randomUUID()
                                            .toString();
                        }
                        fieldLoc.set(obj,
                                     stringLoc);
                    }
                } else if (typeLoc.getName()
                                  .equals("int")) {
                    int maxLoc = myAnnoLoc.max();
                    Random randomLoc = new SecureRandom();
                    int nextIntLoc = randomLoc.nextInt(maxLoc);
                    fieldLoc.setInt(obj,
                                    nextIntLoc);
                } else if (Integer.class.equals(typeLoc)) {
                    int maxLoc = myAnnoLoc.max();
                    Random randomLoc = new SecureRandom();
                    int nextIntLoc = randomLoc.nextInt(maxLoc);
                    fieldLoc.set(obj,
                                 nextIntLoc);
                }
            }
        }
        return (T) obj;
    }

}
