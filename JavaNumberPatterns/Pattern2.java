package java_NumberPatterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n=obj.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}

}
