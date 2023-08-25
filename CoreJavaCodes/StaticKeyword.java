package core_JAVA_codes;

import java.util.Scanner;

public class StaticKeyword {
	/**
	 * one declares variables and methods. These variables and methods are called
	 * instance variable & method Example.., static int count -> these are called
	 * static members Static methods are called using class names 1. They can only
	 * call other static methods 2. They can only access the static data 3. They
	 * cannot refer to "this" or "super" in any way
	 */
	static int a1;
	static int b1;
	static int c1;

	static void getData(int x, int y, int z) {
		a1 = x;
		b1 = y;
		c1 = z;
		System.out.println(a1);
	}

	static int getObjData(int a, int b) {
		int area1 = a + b;
		return area1;
	}
}

class Static {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int x = obj.nextInt();
			int y = obj.nextInt();
			int z = obj.nextInt();
			int a = obj.nextInt();
			int b = obj.nextInt();

			//className.MethodName()
			StaticKeyword.getData(x, y, z);

			int area2 = StaticKeyword.getObjData(a, b);
			System.out.print(area2);
		}
	}
}
