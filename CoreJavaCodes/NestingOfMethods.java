package core_JAVA_codes;

import java.util.Scanner;

public class NestingOfMethods {

	/**
	 * A method can be called by using only its name by another method of the same
	 * class called Nesting of Methods
	 */

	int obj1, obj2, c, d;

	NestingOfMethods(int x, int y) {
		obj1 = x;
		obj2 = y;
	}

	int Nesting() {
		c = obj1;
		d = obj2;
		int area = c * d;
		return area;
	}

	int NestingMethod() {
		int obj = Nesting(); //Nesting of methods
		return obj;
	}
}

class Nesting {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int x = obj.nextInt();
			int y = obj.nextInt();

			NestingOfMethods n1 = new NestingOfMethods(x, y);
			int a1 = n1.NestingMethod();
			System.out.println(a1);
		}
	}
}
