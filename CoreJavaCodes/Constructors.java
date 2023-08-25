package core_JAVA_codes;

import java.util.Scanner;

public class Constructors {

	// declaring the variables
	int length, width;

	// default constructor
	Constructors() {
		
	}

	// Parameter constructor
	Constructors(int x, int y) {
		length = x;
		width = y;
	}

	// creating one method
	int getArea() {
		int area = length * width;
		return area;
	}
}

class Maine {
	// main method
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int x = obj.nextInt();
			int y = obj.nextInt();
			Constructors Rv = new Constructors(x, y);
			int area = Rv.getArea();
			System.out.println("Area of Object"+" "+area);
		}
	}
}
