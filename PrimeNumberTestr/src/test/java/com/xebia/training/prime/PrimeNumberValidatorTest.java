package com.xebia.training.prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberValidatorTest {
	
	@Test
	void test1NotPrime() {
		PrimeNumberValidator classUnderTest = new PrimeNumberValidator();
		assertFalse(classUnderTest.isPrime(1));
	}

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
	
	@Test
	void test4NotPrime() {
		PrimeNumberValidator classUnderTest = new PrimeNumberValidator();
		assertFalse(classUnderTest.isPrime(4));
	}

}
