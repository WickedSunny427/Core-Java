package com.corejavaprojects.loops;

import java.util.Scanner;

public class PatternCharacter {

	public static void main(String[] args) {

		String input;
		int rows;

		PatternCharacter obj = new PatternCharacter();

		System.out.println("Enter number of rows to be printed : ");
		rows = obj.getRows();

		System.out.println("Enter any Character : ");
		input = obj.getUserInput();

		System.out.println("Pattern 1 \n");
		obj.displayPattern1(input, rows);
		System.out.println();

		System.out.println("Pattern 2 \n");
		obj.displayPattern2(input, rows);
		System.out.println();

		System.out.println("Pattern 3 \n");
		obj.displayPattern3(input, rows);
		System.out.println();

		System.out.println("Pattern 4 \n");
		obj.displayPattern4(input, rows);
		System.out.println();

		System.out.println("Pattern 5 \n");
		obj.displayPattern5(input, rows);
		System.out.println();

		System.out.println("Pattern 6 \n");
		obj.displayPattern6(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 7 - Pyramaid - Approach 1 -------- \n");
		obj.displayPattern7(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 7 - Pyramaid - Approach 2 -------- \n");
		obj.displayPattern7Logic(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 8 - Pyramaid with Increasing Chracters- Approach 1 -------- \n");
		obj.displayPattern8(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 8 - Pyramaid with Increasing Chracters- Approach 2 -------- \n");
		obj.displayPattern8Logic(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 9 - Pyramaid Pattern Chracters- Approach 1 -------- \n");
		obj.displayPattern9(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 10 - Diagonal - 1 -------- \n");
		obj.displayPattern10(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 11 - Diagonal - 2 -------- \n");
		obj.displayPattern11(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 12 - Diagonal - Down Combo -------- \n");
		obj.displayPattern12(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 13 - Diagonal - Up Combo -------- \n");
		obj.displayPattern13(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 14 - Intersecting Diagonal -------- \n");
		obj.displayPattern14(input, rows);
		System.out.println();

		System.out.println("--------- Pattern 14 - Square -------- \n");
		obj.displayPattern15(input, rows);
		System.out.println();

	}

	private void displayPattern1(String input, int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(input); // Print *
			}
			System.out.println(); // Line break
		}
	}

	private void displayPattern2(String input, int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(input); // Print *
			}
			System.out.println(); // Line break
		}
	}

	private void displayPattern3(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(input);
			}
			System.out.println();
		}

		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) { // Reduce one column to avoid Duplicate
				System.out.print(input);
			}
			System.out.println();
		}
	}

	private void displayPattern4(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) {// Reduce one column to avoid Extra space in the beginning.
				System.out.print(" "); // Print Space
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(input); // Print * immediately after space
			}
			System.out.println(); // Line break
		}
	}

	private void displayPattern5(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 2; j <= i; j++) { // Start from index 2 , so as to avoid blank space in the beginning.
				System.out.print(" "); // Print Space
			}
			for (int k = rows; k >= i; k--) {
				System.out.print(input); // Print * immediately after space
			}
			System.out.println(); // Line break
		}
	}

	private void displayPattern6(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) { // Start from index 2 , so as to avoid blank space in the beginning.
				System.out.print(" "); // Print Space
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(input); // Print * immediately after space
			}
			System.out.println(); // Line break
		}

		// For below Triangle
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) { // Start from index 2 , so as to avoid blank space in the beginning.
				System.out.print(" "); // Print Space
			}
			for (int k = rows - 1; k >= i; k--) {
				System.out.print(input); // Print * immediately after space
			}
			System.out.println(); // Line break
		}
	}

	private void displayPattern7(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) {
				System.out.print(" "); // Print Space
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" " + input); // Add one space before Character.
			}
			System.out.println(); // Line break
		}
	}

	private void displayPattern7Logic(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= 1; j--) { // Checking column vs row, thats why till 1 and not i.
				if (j > i) { // If column is greater than row print space
					System.out.print(" ");
				} else {// If column is less than row print space and character.
					System.out.print(" " + input);
				}
			}
			System.out.println(); // Print new line.
		}
	}

	private void displayPattern8(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) { // Printing space 1st half.
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(input); // First Half *'s
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(input); // Second Half *'s
			}

			System.out.println(); // Print new line.
		}
	}

	private void displayPattern8Logic(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) { // Printing space 1st half.
				System.out.print(" ");
			}
			for (int k = 2; k <= (2 * i); k++) {// Removed additional loop used earlier and using logic.
				System.out.print(input); // First Half *'s
			}
			System.out.println(); // Print Spnew line.ace
		}
	}

	private void displayPattern9(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 2; j <= i; j++) { // Printing space 1st half.
				System.out.print(" ");
			}
			for (int k = rows; k >= i; k--) {//
				System.out.print(input); // Second Half *'s
			}
			for (int l = rows - 1; l >= i; l--) {//
				System.out.print(input); // Third Half *'s
			}
			System.out.println(); // Print new line
		}
	}

	private void displayPattern10(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.print("*");// Instead use condition
				if (i >= 2 && j <= i - 1) {
					System.out.print(" ");
				} else {
					System.out.print(input);
				}
			}
			System.out.println(); // Print new line
		}
	}

	private void displayPattern11(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				// System.out.print(input); // Instead use condition
				if (i >= 2 && k > 1) {
					System.out.print(" ");
				} else {
					System.out.print(input);
				}
			}
			System.out.println(); // Print new line
		}
	}

	private void displayPattern12(String input, int rows) {
		for (int i = rows; i >= 1; i--) {
			for (int j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				// System.out.print(input); // Instead use condition
				if (k > 1 && k < (i * 2) - 1) {
					System.out.print(" ");
				} else {
					System.out.print(input);
				}
			}
			System.out.println(); // Print new line
		}
	}

	private void displayPattern13(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				// System.out.print(input); // Instead use condition
				if (k > 1 && k < (i * 2) - 1) {
					System.out.print(" ");
				} else {
					System.out.print(input);
				}
			}
			System.out.println(); // Print new line
		}
	}

	private void displayPattern14(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				// If row == column or if row+column==rows-1 retain character
				/// System.out.print(input);
				if (i == j || i + j == rows + 1) {// 1+5==row+1
					System.out.print(input);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Print new line
		}
	}

	private void displayPattern15(String input, int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				// If row == column  retain character
				if (i == 1 || j == 1 || i==rows || j==rows) {
					System.out.print(input);
				} else {
					System.out.print("  "); // took 2 spaces
				}
			}
			System.out.println(); // Print new line
		}
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private int getRows() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}