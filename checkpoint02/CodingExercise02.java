package com.beacon.java.training.checkpoint02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingExercise02 {

	public void print(String name, int num) {

		if (name.equalsIgnoreCase("BOX")) {
			ConsolePrinter cp = new ConsolePrinter();
			cp.printBox(num);
			// Calling Printbox
			// BoxPrinter bp = new BoxPrinter();
			// bp.printBox(num);
		}
		if (name.equalsIgnoreCase("X")) {
			ConsolePrinter.printX(num);
		}
	}

	public static void main(String[] args) {
		System.out.println("What to print? BOX or X");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = in.readLine()) != null && (line.length() != 0)
					&& ((line.equalsIgnoreCase("BOX")) || (line.equalsIgnoreCase("X")))) {

				CodingExercise02 cd = new CodingExercise02();
				if (line.equals("BOX")) {
					System.out.println("Size of the box? ");
					String size = in.readLine();
					int size2 = Integer.parseInt(size);
					cd.print("BOX", size2);

				} else {
					System.out.println("Size of the X (size should be an odd number?) ");
					String size = in.readLine();
					int size3 = Integer.parseInt(size);
					if (size3 % 2 == 0) {
						System.out.println("Should be odd number");
					} else if (size3 % 2 != 0) {
						int number = size3;
						cd.print("X", number);
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}