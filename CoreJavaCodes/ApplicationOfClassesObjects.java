package core_JAVA_codes;

import java.util.Scanner;

public class ApplicationOfClassesObjects {

	// declaration of variables
	int length, breadth;

	// Constructor for initializing length and breadth
	ApplicationOfClassesObjects(int x, int y) {
		length = x;
		breadth = y;
	}

	// creating one more method
	int getArea() {
		int area = length * breadth;
		return area;
	}
}

class Main {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int x = obj.nextInt();
			int y = obj.nextInt();

			// Creating an instance of ApplicationOfClassesObjects using the constructor
			ApplicationOfClassesObjects R1 = new ApplicationOfClassesObjects(x, y);

			// Calculating and printing the area
			int area = R1.getArea();
			System.out.println("Area of the rectangle: " + area);
		}
	}
}
