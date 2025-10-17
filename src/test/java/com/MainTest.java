package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int addNum = 1;
		int trueResult = addNum + addNum;
		int result = main.add(1, 1);
		assertEquals(trueResult, result);
	}

}
