package java_Basic_Interview_Codes;

import java.util.Scanner;

public class SquareRootsBetweenTwoNumbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            for (int i = a; i <= b; i++) {
                int x = i * i;
                System.out.print(x + " ");
            }
        }
    }
}
