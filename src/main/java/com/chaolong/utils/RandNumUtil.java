package com.chaolong.utils;

import java.util.Random;

/**
 * 
 * @ClassName: RandNumUtil 
 * @Description: 随机数工具类
 * @author: wuchaolong
 * @date: 2020年4月27日 上午8:42:15
 */
public class RandNumUtil {
	
	/**
	 * 
	 * @Title: getValue 
	 * @Description: 获得指定范围的随机小数
	 * @param min 
	 * @param max 
	 * @param scale 精度 小数点后的位数
	 * @return
	 * @return: double
	 */
	
	public static double getValue(final double min ,final double max,final int scale) {
		// 如果min > max
		if(min > max || scale < 0)
			return -1;
		
		int j = 1;
		for (int i = 0; i < scale; i++) {
			j *= 10;
		}
		
		// 如果scale为0
		if(scale == 0) {
			double random = (double)RandomUtil.random((int)(min), (int)(max));
			return random;
		}else {
			// 将传进来的参数同时扩大 scale*10 的倍数 生成两者之间的随机数\
			
			double mi = min * j;
			double ma = max * j;
			double random = (double)RandomUtil.random((int)mi,(int)ma);
			// 将生成的数精确回小数点后scale位
			double value = random / j;
			return value;
		}
		
	}
	/**
	 * 
	 * @Title: random 
	 * @Description: 返回min-max 之间的随机整数  包含min 不包含max
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
