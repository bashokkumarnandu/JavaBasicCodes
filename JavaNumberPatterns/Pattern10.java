package java_NumberPatterns;

import java.util.Scanner;
// Fibonacci Triangle
public class Pattern10 {

	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int n=obj.nextInt();
			for(int i=1;i<=n;i++) {
				int a=0;
				int b=1;
				for(int j=1;j<=i;j++) {
					int c=a+b;
					System.out.print(a+" ");
					a=b;
					b=c;
				}
				System.out.println();
			}
		}
	}
}
