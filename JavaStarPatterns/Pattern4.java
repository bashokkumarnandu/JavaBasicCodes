package java_StarPatterns;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n = obj.nextInt();
			for(int i=n;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
