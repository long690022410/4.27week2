package com.chaolong.utils;

import java.util.Random;

/**
 * 
 * @ClassName: RandNumUtil 
 * @Description: �����������
 * @author: wuchaolong
 * @date: 2020��4��27�� ����8:42:15
 */
public class RandNumUtil {
	
	/**
	 * 
	 * @Title: getValue 
	 * @Description: ���ָ����Χ�����С��
	 * @param min 
	 * @param max 
	 * @param scale ���� С������λ��
	 * @return
	 * @return: double
	 */
	
	public static double getValue(final double min ,final double max,final int scale) {
		// ���min > max
		if(min > max || scale < 0)
			return -1;
		
		int j = 1;
		for (int i = 0; i < scale; i++) {
			j *= 10;
		}
		
		// ���scaleΪ0
		if(scale == 0) {
			double random = (double)RandomUtil.random((int)(min), (int)(max));
			return random;
		}else {
			// ���������Ĳ���ͬʱ���� scale*10 �ı��� ��������֮��������\
			
			double mi = min * j;
			double ma = max * j;
			double random = (double)RandomUtil.random((int)mi,(int)ma);
			// �����ɵ�����ȷ��С�����scaleλ
			double value = random / j;
			return value;
		}
		
	}
	/**
	 * 
	 * @Title: random 
	 * @Description: ����min-max ֮����������  ����min ������max
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min,int max) {
		Random random = new Random();
		int i = random.nextInt(max - min);
		
		return i + min;
	}
	
	
	
	
}
