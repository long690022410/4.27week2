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
		// ��С���� ʱ��Ϊ2012��1��1��
		Calendar cal = Calendar.getInstance();
		cal.set(2012,0,1);
		// ����100��TPS������� �� ���
		for (int i = 1; i <= 100; i++) {
			Person2 p = new Person2();
			// id ��1��ʼ����
			BigInteger bi = new BigInteger(new Integer(i).toString());
			p.setId(bi);
			// ����  �� �ټ���  �� ���1-2���ĺ���
			p.setName(ZHStringUtil.getZHName());
			// ���� 1-100�� ������100
			p.setAge(RandNumUtil.random(1,100));
			// н�� 3-8W С�����2λ
			p.setXin(new BigDecimal(RandNumUtil.getValue(30000.00, 80000.00, 2)));
			// Ƹ������ 2012��1��1������
			p.setTime(DateUtil.random(cal.getTime(), new Date()));
			// �������
			System.out.println(p);
		}
		
		
	}
	
}
