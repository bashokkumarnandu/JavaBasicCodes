package java_Basic_Interview_Codes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int Rev = 0;
            while (n > 0) {
                int r = n % 10;
                Rev = Rev * 10 + r;
                n = n / 10;
            }
            System.out.print(Rev);
        }
    }
}
