package java_Basic_Interview_Codes;

import java.util.Scanner;

public class SwappingThreeNumbersUsingTempVariable {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();

            int d = a;
            a = b;
            b = c;
            c = d;

            System.out.print(a + " " + b + " " + c);
        }
    }
}
