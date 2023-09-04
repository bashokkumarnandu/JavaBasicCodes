package java_HallowPatterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n = obj.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					if(i==1 || j==n || j==i) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
}
