package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        System.out.println(str);
        if (org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            if (org.apache.commons.lang3.StringUtils.equals(str, "0")) {
                return true;
            }
            return !org.apache.commons.lang3.StringUtils.contains(str, "-");
        }
        return false;
    }
}
