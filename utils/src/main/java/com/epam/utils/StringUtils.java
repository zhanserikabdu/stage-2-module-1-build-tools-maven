package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && NumberUtils.toDouble(str) > 0;
    }
}
