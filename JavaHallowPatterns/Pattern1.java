package java_HallowPatterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n = obj.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == 1 || i == n || j == 1 || j == n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
}
