package com.training.java.enums;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumRun {

    public static void main(final String[] args) {
        Map<EError, String> mapLoc = new HashMap<>();
        EnumMap<EError, String> enumMapLoc = new EnumMap<>(EError.class);
    }

}
