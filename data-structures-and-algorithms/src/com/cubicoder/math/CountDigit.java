package com.cubicoder.math;

import java.util.Scanner;

public class CountDigit {

	public static int digitCount(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		return count;
	}
	
	// With recursion
	static int countDigit(int n)
	{
		if (n/10 == 0)
			return 1;
		return 1 + countDigit(n / 10);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("No Of Digit :: " + CountDigit.digitCount(num));
		sc.close();
	}
}
