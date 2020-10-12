package com.sapient.math;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMathService {

	private MathService service;

	@BeforeEach
	void init() {
		service = new MathService();
	}
	
	
	//Tests for isPrime
	
	
	@Test
	void testIsPrimeThree() {
		String expected = service.isPrime(3);
		String actual = "Prime";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testIsPrimeFour() {
		String expected = service.isPrime(4);
		String actual = "Non-prime";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testIsPrimeNegative() {
		String expected = service.isPrime(-4);
		String actual = "Invalid number";
		Assertions.assertEquals(expected, actual);
	}

	
	//Tests for factorial 
	
	@Test
	void testFactorialTwo() {
		int expected = service.factorial(2);
		int actual = 2;
		Assertions.assertEquals(expected, actual);
	}

	
	
	//Tests for Fibonacci
	
	@Test
	void testFibonacciNine() {
		int expected = service.fibonacci(9);
		int actual = 34;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testFibonacciNegative() {
		int expected = service.fibonacci(-9);
		int actual = -1;
		Assertions.assertEquals(expected, actual);
	}
	
	
	//Tests for getPrimes
	@Test
	void testgetPrimesNormal() {
		List<Integer> expected = service.getPrimes(1,10);
		List<Integer> actual = Arrays.asList(2,3,5,7);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testgetPrimesReverse() {
		List<Integer> expected = service.getPrimes(10,1);
		List<Integer> actual = Arrays.asList(2,3,5,7);
		Assertions.assertEquals(expected, actual);
	}
}
