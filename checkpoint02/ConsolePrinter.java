package com.beacon.java.training.checkpoint02;

public class ConsolePrinter extends BoxPrinter {

	public static void printX(int intX) {
		int number = intX;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= (number); j++) {
				if (i == j) {
					System.out.print("*");
				} else if (i + j == (number - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
