package com.cubicoder.math;

import java.util.Scanner;

public class PalindromNumber {

	public static boolean palindromNumber(int num) {
		int temp = num;
		int reverse = 0;
		while (num > 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}

		if (temp == reverse)
			return true;

		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("No is Palindrom :: " + PalindromNumber.palindromNumber(num));
		sc.close();
	}
}
