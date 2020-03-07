package com.xebia.training.prime;


public class PrimeNumberValidatorTest {
	
	private PrimeNumberValidator classUnderTest;
	
	public PrimeNumberValidatorTest() {
		classUnderTest = new PrimeNumberValidator();
	}
	
	public static void main(String[] args) {
		PrimeNumberValidatorTest test = new PrimeNumberValidatorTest();
		test.testNegativeNotPrime();
		test.test2Prime();
		test.test3Prime();
		test.test4NotPrime();
		System.out.println("All tests passed");
	}
	

	void testNegativeNotPrime() {
		if(classUnderTest.isPrime(-1)) {
			throw new RuntimeException("testNegativeNotPrime failed");
		};
	}
	

	void test1NotPrime() {
		if(classUnderTest.isPrime(1)) {
			throw new RuntimeException("test1NotPrime failed");
		}
	}

	void test2Prime() {
		if(!classUnderTest.isPrime(2)) {
			throw new RuntimeException("test2Prime failed");
		}
	}
	
	void test3Prime() {
		if(!classUnderTest.isPrime(3)) {
			throw new RuntimeException("test3Prime failed");
		}
	}
	
	void test4NotPrime() {
		if(classUnderTest.isPrime(4)) {
			throw new RuntimeException("test4NotPrime failed");
		}
	}

}
