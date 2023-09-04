package java_NumberPatterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt();
			int b = obj.nextInt();
			for (int i = a; i <= b; i++) {
				for (int j = a; j <= b; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
}
