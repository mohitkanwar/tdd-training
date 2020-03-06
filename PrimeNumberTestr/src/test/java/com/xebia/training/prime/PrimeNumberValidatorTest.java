package com.xebia.training.prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberValidatorTest {

	@Test
	void test2Prime() {
		PrimeNumberValidator classUnderTest = new PrimeNumberValidator();
		assertTrue(classUnderTest.isPrime(2));
	}
	
	@Test
	void test3Prime() {
		PrimeNumberValidator classUnderTest = new PrimeNumberValidator();
		assertTrue(classUnderTest.isPrime(3));
	}
	

}
