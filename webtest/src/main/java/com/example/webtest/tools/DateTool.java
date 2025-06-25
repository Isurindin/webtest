package com.example.webtest.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author PJM
 * @date 2025/6/25-15:36
 */
public class DateTool {

    public static String getDateTime(){
        // 创建一个日期格式化对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return format.format(date);
    }

}
