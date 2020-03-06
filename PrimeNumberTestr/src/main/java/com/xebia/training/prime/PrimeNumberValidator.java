package com.xebia.training.prime;

/**
 * This program intends to find if a given number is prime or not.
 * To check this, It divides the given number from 2 till half of the given number.
 * If the number is perfectly divisible by any of the number, It is not a prime.
 * If no such divisor is found, the number is a Prime number.
 **/

public class PrimeNumberValidator {
	
	public boolean isPrime(int number) {
		
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
