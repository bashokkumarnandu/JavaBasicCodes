package progressions_AP_GP_HP;

import java.util.Scanner;

public class SumOfNthTermOfAP {
	//int sum=(n/2)*[(2*a)+((n-1)*d)];
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
			int a = obj.nextInt();
			int d = obj.nextInt();
			int n = obj.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+a;
				a=a+d;
			}
			System.out.print(sum);
		}
	}
}