package com.beacon.java.training.checkpoint02;

public class BoxPrinter {
	public void printBox(int intbox) {
		for (int i = 1; i <= intbox; ++i) {
			for (int j = 1; j <= intbox; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
