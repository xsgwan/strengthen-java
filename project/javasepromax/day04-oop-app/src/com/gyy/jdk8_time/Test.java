package com.gyy.jdk8_time;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 传统的时间类(Date、SimpleDateFormat、Calendar)存在如下问题:
        // 1、设计不合理,使用不方便,很多都被淘汰了
        Date d = new Date();
        // System.out.println(d.getYear() + 1900);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 2、都是可变时象,修改后会丢失最开始的时间信息

        // 3、线程不安全

        // 4、不能精确到纳秒,只能精确到毫秒
        // 1秒 = 1000毫秒  1毫秒 = 1000微秒    1微秒 = 1000 纳秒
    }
}
