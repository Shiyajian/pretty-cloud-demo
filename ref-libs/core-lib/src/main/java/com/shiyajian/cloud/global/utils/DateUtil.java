package com.shiyajian.cloud.global.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shiyajian
 * create: 2018-12-06
 */
public class DateUtil {

    /** example: 2018-12-12 12:20:00 */
    private static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";

    private DateUtil() { /* no instance */ }

    public static String nowDateTimeToString() {
        return new SimpleDateFormat(PATTERN_DATETIME).format(new Date());
    }
}
