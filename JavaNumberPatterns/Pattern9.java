package java_NumberPatterns;

import java.util.Scanner;
// Pascal Triangle
public class Pattern9 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n = obj.nextInt();
			for (int i = 1; i <= n; i++) {

				for (int j = n; j > i; j--) {
					System.out.print(" ");
				}

				int temp = 1;
				for (int j = 1; j <= i; j++) {
					System.out.print(temp + " ");
					temp = temp * (i - j) / (j);
				}
				System.out.println();
			}
		}
	}
}
