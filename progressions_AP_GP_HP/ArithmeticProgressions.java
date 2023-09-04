package progressions_AP_GP_HP;

import java.util.Scanner;

public class ArithmeticProgressions {
	/**
	 * Arithmetic Progression: a, a + d, a + 2d, a + 3d, a + 4d, ………. ,a + (n – 1)d; 
	 * First term -> (a) ;Common difference ->(d) ;nth Term -> (n)
	 **/

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt();
			int d = obj.nextInt();
			int n = obj.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				a = a + d;
			}
		}
	}

}
