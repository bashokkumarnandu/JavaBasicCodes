package java_Basic_Interview_Codes;

import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            for (int i = 1; i <= a * b; i++) {
                if (i % a == 0 && i % b == 0) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}
