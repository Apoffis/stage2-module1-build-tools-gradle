package com.epam.demo;

import org.apache.commons.lang3.StringUtils;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean res = args.stream().anyMatch(a -> !StringUtils.isNumeric(a) && Integer.parseInt(a) < 0);
        return !res;
    }
}