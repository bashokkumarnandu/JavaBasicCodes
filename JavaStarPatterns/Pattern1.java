package java_StarPatterns;

import java.util.Scanner;
/**
 			* * * * *
 			* * * * *
 			* * * * *
*/
public class Pattern1 {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a=obj.nextInt();
			int b=obj.nextInt();
			//outer loop
			for(int i=1;i<=a;i++) {
				//inner loop
				for(int j=1;j<=b;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
