package com.epam.utils;

import java.util.List;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        if (str == null || str.isEmpty()) return false;

        return Double.parseDouble(str) > 0;
    }
}
