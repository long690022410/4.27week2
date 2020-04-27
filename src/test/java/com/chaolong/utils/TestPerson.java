package com.chaolong.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import wuchaolong_week2.Person2;

public class TestPerson {
	
	@Test
	public void test() {
		ArrayList<Person2> list = new ArrayList<>();
		// 最小日期 时间为2012年1月1日
		Calendar cal = Calendar.getInstance();
		cal.set(2012,0,1);
		// 生成100个TPS服务对象 并 输出
		for (int i = 1; i <= 100; i++) {
			Person2 p = new Person2();
			// id 从1开始递增
			BigInteger bi = new BigInteger(new Integer(i).toString());
			p.setId(bi);
			// 姓名  姓 百家姓  名 随机1-2中文汉字
			p.setName(ZHStringUtil.getZHName());
			// 年龄 1-100岁 不包含100
			p.setAge(RandNumUtil.random(1,100));
			// 薪酬 3-8W 小数点后2位
			p.setXin(new BigDecimal(RandNumUtil.getValue(30000.00, 80000.00, 2)));
			// 聘用日期 2012年1月1日至今
			p.setTime(DateUtil.random(cal.getTime(), new Date()));
			// 输出对象
			System.out.println(p);
		}
		
		
	}
	
}
