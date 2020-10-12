package com.sapient.math;

import java.util.ArrayList;
import java.util.List;

public class MathService {
	public String isPrime(int num) {
		if (num < 0)
			return "Invalid number";
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non-prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			return "Prime";
		}
		return "Non-prime";
	}

	public int factorial(int number) {
		int i;
		int fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public int fibonacci(int n) {
		if (n < 0)
			return -1;
		int[] f = new int[n + 1];
		int i;

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;

		if (n > 0) {
			f[1] = 1;

			for (i = 2; i <= n; i++) {

				f[i] = f[i - 1] + f[i - 2];
			}
		}

		return f[n];
	}

	public List<Integer> getPrimes(int to, int from) {
		int i;
		int j;
		int flag;
		List<Integer> result = new ArrayList<>();
		if (to > from) {
		      int temp = to;
		      to = from;
		      from = temp;
		   }
		for (i = to; i <= from; i++) {

			// Skip 0 and 1
			if (i == 1 || i == 0)
				continue;

			// flag variable to tell
			// if i is prime or not
			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			// flag = 1 means i is prime
			// and flag = 0 means i is not prime
			if (flag == 1)
				result.add(i);
		}
		return result;
	}
}
