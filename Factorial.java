package java_Basic_Interview_Codes;

import java.util.Scanner;

public class Factorial {

	// Find the factorial value of n!
	/**public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n = obj.nextInt();
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.print(fact);
		}
	} **/

	// Find the value of (4!*3!*2!)
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt(), Fact = 1;
			int b = obj.nextInt(), Bact = 1;
			int c = obj.nextInt(), Cact = 1;
			for (int i = a; i >= 1; i--) {
				Fact = Fact * i;
			}
			for (int i = b; i >= 1; i--) {
				Bact = Bact * i;
			}
			for (int i = c; i >= 1; i--) {
				Cact = Cact * i;
			}
			System.out.print(Fact * Bact * Cact);
		}
	}
}
