package java_Basic_Interview_Codes;

import java.util.Scanner;

public class PositiveNegitiveNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            if (n > 0) {
                System.out.println("Positive Number");
            } else if (n < 0) {
                System.out.println("Negative Number");
            } else if (n == 0) {
                System.out.println("Zero");
            }
        }
    }
}
