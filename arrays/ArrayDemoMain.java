package com.corejavaprojects.arrays;

public class ArrayDemoMain {

	public static void main(String[] args) {

		ArrayDemoMain object = new ArrayDemoMain();

		object.arrayCreateMethod1();
		object.arrayCreateMethod2();
		object.arrayCreateSingleDimensional();
		object.arrayCreateMultiDimensionalWay1();
		object.arrayCreateMultiDimensionalWay2();
	}

	private void arrayCreateMethod1() {
		int arr[] = new int[5];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		// arr[5] = 12;//java.lang.ArrayIndexOutOfBoundsException:
		System.out.println("----------- Creating array using Method 1 -----------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value is : " + arr[i]);
		}
		System.out.println();
	}

	private void arrayCreateMethod2() {
		int arr[] = { 2, 4, 6, 8, 10 };

		System.out.println("----------- Creating array using Method 2 -----------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value is : " + arr[i]);
		}
		System.out.println();
	}

	private void arrayCreateSingleDimensional() {
		String students[] = new String[4];
		students[0] = "Sunny";
		students[1] = "Gunjan";
		students[2] = "Sravan";
		students[3] = "Anusha";

		System.out.println("----------- CreatingSingle Dimensional array -----------------");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Name is : " + students[i]);
		}
		System.out.println();
	}

	private void arrayCreateMultiDimensionalWay1() {
		String languages[][] = new String[2][2];
		languages[0][0] = "Java";
		languages[0][1] = "Python";
		languages[1][0] = "C#";
		languages[1][1] = "SQL";

		System.out.println("----------- Creating Multi Dimensional array Way 1 -----------------");
		for (int i = 0; i < languages.length; i++) {
			for (int j = 0; j < languages.length; j++) {
				System.out.println("Value is : " + languages[i][j]);
			}
		}
		System.out.println();
	}

	private void arrayCreateMultiDimensionalWay2() {
		String languages[][] = {{"Oracle","Python"},{"SQL","C"}};
	
		System.out.println("----------- Creating Multi Dimensional array Way 2-----------------");
		for (int i = 0; i < languages.length; i++) {
			for (int j = 0; j < languages.length; j++) {
				System.out.println("Value is : " + languages[i][j]);
			}
		}
		System.out.println();
	}

}
