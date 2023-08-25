package java_Basic_Interview_Codes;

import java.util.Scanner;

public class Highest_LowsetDigitInANumber {

    //Print the highest digit in a number
    /**public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int s = 0;
            while (n > 0) {
                int r = n % 10;
                if (s < r) {
                    s = r;
                }
                n = n / 10;
            }
            System.out.print(s);
        }
    } **/

    //Print the lowest digit in a number
    /**public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int s = n%10;
            while (n > 0) {
                int r = n % 10;
                if (s > r) {
                    s = r;
                }
                n = n / 10;
            }
            System.out.print(s);
        }
    } **/

    //Print the difference between Highest digit and the lowest digit
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int max=0, min=9,s=n%10;
            while (n > 0) {
                int r = n % 10;
                if (s > r) {
                    min = r;
                }else{
                    max = r;
                }
                n = n / 10;
            }
            System.out.print(max-min);
        }
    }
}
