package java_Basic_Interview_Codes;

import java.util.Scanner;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int Sum = 0;
            while (n != 0) {
                int r = n % 10;
                Sum = Sum + r;
                n = n / 10;
            }
            System.out.println(Sum);
        }
    }
}
