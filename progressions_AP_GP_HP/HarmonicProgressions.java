package progressions_AP_GP_HP;

import java.util.Scanner;

public class HarmonicProgressions {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt();
			int d = obj.nextInt();
			int n = obj.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.print(1/a + " ");
				a = a + d;
			}
		}
	}

}
