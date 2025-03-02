package com.cubicoder.math;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int num) {

		int fact = 1;
		if (num == 0)
			return 1;

		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}

		return fact;
	}
	
	static int factorialRecursion(int n){
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Factorial Of " + num + ":: " + Factorial.factorial(num));
		sc.close();
	}
}
