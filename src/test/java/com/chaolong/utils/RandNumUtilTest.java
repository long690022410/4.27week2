package com.chaolong.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		double min = 3.333;
		double max = 4.333;
		int scale = 3;
		for (int i = 0; i < 50; i++) {
			double value = RandNumUtil.getValue(min, max, scale);
			System.out.println(value);
			if(value < min || value > max) {
				System.out.println("出bug了");
			}
		}
	}

	@Test
	public void testRandom() {
		int min = 2;
		int max = 4;
		for (int i = 0; i < 50; i++) {
			int random = RandNumUtil.random(min,max);
			System.out.println(random);
			if(random < min || random >= max) {
				System.out.println("出bug了");
			}
		}
	}

}
