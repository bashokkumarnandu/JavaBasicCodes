package java_Basic_Interview_Codes;

import java.util.Scanner;

public class GcdOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();
            int n = 0;
            for (int i = 1; i <= a && i <= b && i <= c; i++) {
                if (a % i == 0 && b % i == 0 && c % i == 0) {
                    n = i;
                }
            }
            System.out.print(n);
        }
    }
}
