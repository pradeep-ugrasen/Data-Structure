package com.cubicoder.math;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
	
	public static double convertCelsiusToFahrenheit(int celsius) {
		return (celsius*9.0/5)+32;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(" Temperature to Fahrenheit :: " + ConvertCelsiusToFahrenheit.convertCelsiusToFahrenheit(num));
		sc.close();
	}
}
