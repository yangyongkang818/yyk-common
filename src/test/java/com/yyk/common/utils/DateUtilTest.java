package com.yyk.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void testRandomDate() {
		//获取日历类
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);//为日历类设置
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
	}

}
