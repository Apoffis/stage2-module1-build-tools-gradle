package com.epam.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isNotEmpty = args == null || args.isEmpty();
        if(isNotEmpty) return false;
        return args.stream().allMatch(Utils::isNumericAndPositive);
    }

    private static boolean isNumericAndPositive(String strNum) {
        if (strNum == null || strNum.isEmpty()) {
            return false;
        }
        try {
            if (Double.parseDouble(strNum) > 0) {
                return true;
            }

        } catch (NumberFormatException nfe) {
            return false;
        }
        return false;
    }
}