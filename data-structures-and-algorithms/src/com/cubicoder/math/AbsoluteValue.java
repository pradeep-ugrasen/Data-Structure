package com.cubicoder.math;

import java.util.Scanner;

public class AbsoluteValue {

	public static int absoluteValue(int num) {
		if (num < 0) {
			return num * -1;
		} else {
			return num;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("absolute Value :: " + AbsoluteValue.absoluteValue(num));
		sc.close();
	}
}
