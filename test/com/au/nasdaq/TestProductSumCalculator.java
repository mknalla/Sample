package com.au.nasdaq;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

public class TestProductSumCalculator {
	
ProductSumCalculator productSumCalculator;
	
	@Before
	public void setUp() throws Exception {
		productSumCalculator = new ProductSumCalculator();
	}

	@Test
	public void testCalculateSumOfProducts1() {
		BigInteger result = BigInteger.valueOf(21L);
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(5L, 2L).toString());
	}
	
	@Test
	public void testCalculateSumOfProducts2() {
		// c<=0
		BigInteger result = BigInteger.ZERO;
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(5L, 0L).toString());
		
		result = BigInteger.ZERO;
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(5L, -1L).toString());
	}
	
	@Test
	public void testCalculateSumOfProducts3() {
		// n<=0
		BigInteger result = BigInteger.ZERO;
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(0L, 2L).toString());
		
		result = BigInteger.ZERO;
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(-5L, 2L).toString());
	}
	
	@Test
	public void testCalculateSumOfProducts4() {
		// c>=n-1
		BigInteger result = BigInteger.valueOf(33L);
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(5L, 6L).toString());
		
		result = BigInteger.valueOf(33L);
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(5L, 5L).toString());
		
		result = BigInteger.valueOf(33L);
		assertEquals(result.toString(), productSumCalculator.calculateSumOfProducts(5L, 5L).toString());
	}
}
