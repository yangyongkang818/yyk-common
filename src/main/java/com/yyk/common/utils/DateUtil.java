package com.yyk.common.utils;

import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	public static Date getEndMonth(Date date) {
		//��ȡ������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//�������·�+1�� �ٱ���³� -1 ��
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());//���·�+1
		c.setTime(initMonth);//�ٱ���³�
		
		c.add(Calendar.SECOND, -1);//��ȥ1��
		return c.getTime();
		
	}
	
	public  static Date  getInitMonth(Date date) {
		//��ȡһ��������
			Calendar c = Calendar.getInstance();//��ȡ��ǰϵͳʱ���������
			//�ô���������ٳ�ʼ��������
			c.setTime(date);
			//�������������ط���
			c.set(Calendar.DAY_OF_MONTH, 1);//������Ϊ���µĵ�һ��
			c.set(Calendar.HOUR_OF_DAY, 0);//Сʱ
			c.set(Calendar.MINUTE, 0);//����
			c.set(Calendar.SECOND, 0);//��
			
			return c.getTime();
			
		}
	
	
	public  static Date randomDate(Date min,Date max) {
		// ��ȡ��С���ڵĺ�����.��1970��min �ĺ�����
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		if(t1 > t2 ) return null;
		
		double d = Math.random();  //����0-1 ֮������ֵ
	    long x = (long) (d *(t2 - t1 +1 )+t1);
		return new Date(x);
		
	}

}
