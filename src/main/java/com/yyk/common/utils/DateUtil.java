package com.yyk.common.utils;

import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	public static Date getEndMonth(Date date) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//整体让月份+1， 再变成月初 -1 秒
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());//让月份+1
		c.setTime(initMonth);//再变成月初
		
		c.add(Calendar.SECOND, -1);//减去1秒
		return c.getTime();
		
	}
	
	public  static Date  getInitMonth(Date date) {
		//获取一个日历类
			Calendar c = Calendar.getInstance();//获取当前系统时间的日历类
			//用传入的日期再初始化日历类
			c.setTime(date);
			//调用日历类的相关方法
			c.set(Calendar.DAY_OF_MONTH, 1);//让日期为当月的第一天
			c.set(Calendar.HOUR_OF_DAY, 0);//小时
			c.set(Calendar.MINUTE, 0);//分钟
			c.set(Calendar.SECOND, 0);//秒
			
			return c.getTime();
			
		}
	
	
	public  static Date randomDate(Date min,Date max) {
		// 获取最小日期的毫秒数.从1970到min 的毫秒数
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		if(t1 > t2 ) return null;
		
		double d = Math.random();  //返回0-1 之间的随机值
	    long x = (long) (d *(t2 - t1 +1 )+t1);
		return new Date(x);
		
	}

}
