package java_Basic_Interview_Codes;

import java.util.Scanner;
// GCF/HCF - Greatest/Highest common factor
public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int n = 0;
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    n = i;
                }
            }
            System.out.print(n);
        }
    }
}
