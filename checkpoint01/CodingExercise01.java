package com.beacon.java.training.checkpoint01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingExercise01 {

	public static void main(String[] args) {
		System.out.println("What to print? BOX or X");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = in.readLine()) != null && (line.length() != 0)
					&& ((line.equalsIgnoreCase("BOX")) || (line.equalsIgnoreCase("X")))) {

				if (line.equals("BOX")) {
					System.out.println("Size of the box? ");
					String size = in.readLine();
					int size2 = Integer.parseInt(size);
					int rows = size2;
					for (int i = 1; i <= rows; ++i) {
						for (int j = 1; j <= rows; ++j) {
							System.out.print("*");
						}
						System.out.println();
					}
				} else {
					System.out.println("Size of the X (size should be an odd number?) ");
					String size = in.readLine();
					int size3 = Integer.parseInt(size);
					if (size3 % 2 == 0) {
						System.out.println("Should be odd number");
					} else if (size3 % 2 != 0) {
						int number = size3;
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

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}