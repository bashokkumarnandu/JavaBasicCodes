package java_Basic_Interview_Codes;

import java.util.Scanner;

public class SwappingThreeNumbersWithoutUsingTempVariable {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();

            a = a + b + c;
            b = a - (b + c);
            c = a - (b + c);
            a = a - (b + c);

            System.out.print(a + " " + b + " " + c);
        }
    }
}
