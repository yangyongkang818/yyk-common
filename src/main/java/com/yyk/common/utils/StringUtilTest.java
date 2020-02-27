package com.yyk.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean result = StringUtil.hasLength(" ");
		System.out.println(result);
	}

	@Test
	public void testHasText() {
		boolean result = StringUtil.hasText(" ");
		System.out.println(result);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(2);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String generateChineseName = StringUtil.generateChineseName();
			System.out.println(generateChineseName);
		}
		
	}

}
