package java_Basic_Interview_Codes;

import java.util.Scanner;

public class HighestOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();
            if (a > b && a > c) {
                System.out.print(a);
            } else if (b > a && b > c) {
                System.out.print(b);
            } else if (c > a && c > b) {
                System.out.print(c);
            }
        }
    }
}
