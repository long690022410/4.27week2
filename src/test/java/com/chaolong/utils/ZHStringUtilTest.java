package com.chaolong.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZHStringUtilTest {

	@Test
	public void testGetZHString() {
		int n = 2;
		for (int i = 0; i < 50; i++) {
			String name = ZHStringUtil.getZHString(n);
			System.out.println(name);
			if(name.length() > n )
				System.out.println("³öbugÁË");
		}
	}

	@Test
	public void testGetZHName() {
		for (int i = 0; i < 500; i++) {
			String name = ZHStringUtil.getZHName();
			System.out.println(name);
		}
	}

}
