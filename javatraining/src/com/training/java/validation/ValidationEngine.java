package com.training.java.validation;

import java.lang.reflect.Field;

public class ValidationEngine {

    public static <T> T validate(final Object obj) throws ValidationException {
        try {
            Class<T> classLoc = (Class<T>) obj.getClass();
            Field[] declaredFieldsLoc = classLoc.getDeclaredFields();
            for (Field fieldLoc : declaredFieldsLoc) {
                Class<?> typeLoc = fieldLoc.getType();
                if (String.class.equals(typeLoc)) {
                    CheckString annotationLoc = fieldLoc.getAnnotation(CheckString.class);
                    if (annotationLoc != null) {
                        fieldLoc.setAccessible(true);
                        String str = (String) fieldLoc.get(obj);
                        if (str != null) {
                            int lengthLoc = str.length();
                            if (!((lengthLoc > annotationLoc.min()) && (lengthLoc < annotationLoc.max()))) {
                                throw new ValidationException("String Validasyon error : Field : "
                                                              + fieldLoc.getName()
                                                              + " uzunluğu "
                                                              + annotationLoc.min()
                                                              + " ile "
                                                              + annotationLoc.max()
                                                              + " olmalı fakat uzunluğu  "
                                                              + lengthLoc
                                                              + "("
                                                              + str
                                                              + ")");
                            }
                        }
                    }
                } else if (typeLoc.getName()
                                  .equals("int")) {
                    CheckInt annotationLoc = fieldLoc.getAnnotation(CheckInt.class);
                    if (annotationLoc != null) {
                        fieldLoc.setAccessible(true);
                        int intLoc = fieldLoc.getInt(obj);
                        if (!((intLoc > annotationLoc.min()) && (intLoc < annotationLoc.max()))) {
                            throw new ValidationException("Int Validasyon error : Field : "
                                                          + fieldLoc.getName()
                                                          + " değer, "
                                                          + annotationLoc.min()
                                                          + " ile "
                                                          + annotationLoc.max()
                                                          + " olmalı fakat değer  "
                                                          + intLoc);
                        }
                    }
                }
            }
            return (T) obj;
        } catch (Exception eLoc) {
            throw new ValidationException(eLoc);
        }
    }

}
