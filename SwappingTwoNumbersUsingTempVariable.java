package java_Basic_Interview_Codes;

import java.util.Scanner;

public class SwappingTwoNumbersUsingTempVariable {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();

            int c = a;
            a = b;
            b = c;

            System.out.print(a);
            System.out.println();
            System.out.print(b);
        }
    }
}
