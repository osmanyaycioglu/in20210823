package com.training.java.reflection;

import java.lang.reflect.Field;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

import com.training.java.annotations.MyAnnotation;

public class ObjectCreator {

    public static <T> T create(final Class<T> clazz) throws Exception {
        T newInstanceLoc = clazz.newInstance();
        Field[] declaredFieldsLoc = clazz.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            MyAnnotation myAnnoLoc = fieldLoc.getAnnotation(MyAnnotation.class);
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
            MyAnnotation myAnnoLoc = fieldLoc.getAnnotation(MyAnnotation.class);
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
                    fieldLoc.set(obj,
                                 stringLoc);
                } else if (typeLoc.getName()
                                  .equals("int")) {
                    Random randomLoc = new SecureRandom();
                    int nextIntLoc = randomLoc.nextInt();
                    fieldLoc.setInt(obj,
                                    nextIntLoc);
                } else if (Integer.class.equals(typeLoc)) {
                    Random randomLoc = new SecureRandom();
                    int nextIntLoc = randomLoc.nextInt();
                    fieldLoc.set(obj,
                                 nextIntLoc);
                }
            }
        }
        return (T) obj;
    }

}
