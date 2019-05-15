package com.au.nasdaq;

import java.math.BigInteger;

/**
 * Utility class to calculate the product of preceding elements and sum of the products for the given number
 * @author Mahesh
 *
 */
public class ProductSumCalculator {
	
	/**
	 * Method to calculate the sum of products of preceding elements for a given value c and n.
	 * @param n
	 * @param c
	 * @return sum of products of preceding elements
	 */
	public BigInteger calculateSumOfProducts(Long n,Long c) {

		if(c<=0 || n<=1) return BigInteger.ZERO;
		
		BigInteger sum = BigInteger.ZERO;
		Long divisor = 1L;
		BigInteger product = BigInteger.ONE;
		for(Long i=1L; i<n; i++) {
			product = product.multiply(BigInteger.valueOf(i));
			divisor = i-c;
			if(divisor>0) {
				product = product.divide(BigInteger.valueOf(divisor));
			}
			sum = sum.add(product);
		}
		return sum;
	}
}