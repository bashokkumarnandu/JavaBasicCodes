package core_JAVA_codes;

import java.util.Scanner;

public class MethodOverloading {

	/** Same method with different parameters **/

	int length, width, breadth, length1, width1, breadth1;

	MethodOverloading(int a, int b) {
		length = a;
		width = b;
	}

	MethodOverloading(int c) {
		breadth = c;
	}

	MethodOverloading(int d, int e, int f) {
		length1 = d;
		width1 = e;
		breadth1 = f;
	}

	int getObject() {
		int obj = length * width;
		return obj;
	}

	int getObjInIt() {
		int rev = breadth;
		return rev;
	}

	void getArea() {
		int area = length1 * width1 * breadth1;
		System.out.println(area);
	}
}

class Mainl {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt();
			int b = obj.nextInt();
			int c = obj.nextInt();
			int d = obj.nextInt();
			int e = obj.nextInt();
			int f = obj.nextInt();

			MethodOverloading r1 = new MethodOverloading(a, b);
			int a1 = r1.getObject();
			System.out.println(a1);

			MethodOverloading r2 = new MethodOverloading(c);
			int a2 = r2.getObjInIt();
			System.out.println(a2);

			MethodOverloading r3 = new MethodOverloading(d, e, f);
			r3.getArea();
		}
	}
}
