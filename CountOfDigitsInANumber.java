package java_Basic_Interview_Codes;

import java.util.Scanner;

public class CountOfDigitsInANumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int count = 0;
            while (n != 0) {
                n = n / 10;
                count++;
            }
            System.out.print(count);
        }
    }
}
