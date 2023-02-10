package com.rp.service.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.rp.service.impl.RPServiceHelper;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class RPServiceHelperTest {
	
	@InjectMocks
	RPServiceHelper rPServiceHelper;
	
	@Test
	public void testCalculateRewardPoint() {
		Integer response = rPServiceHelper.calculateRewardPoint(120);
		Assertions.assertEquals(90, response);
	}
	
	@Test
	public void withNullValue_TestCalculateRewardPoint() {
		Integer response = rPServiceHelper.calculateRewardPoint(null);
		Assertions.assertEquals(0, response);
	}
	
	@Test
	public void withZeroValue_TestCalculateRewardPoint() {
		Integer response = rPServiceHelper.calculateRewardPoint(0);
		Assertions.assertEquals(0, response);
	}

}
