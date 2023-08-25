package java_Basic_Interview_Codes;

import java.util.Scanner;

class SwappingTwoNumbersWithoutUsingTempVariable {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.print(a);
            System.out.println();
            System.out.print(b);
        }
    }
}