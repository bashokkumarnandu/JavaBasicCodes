package java_Basic_Interview_Codes;

import java.util.Scanner;

public class FibnacciSeries {

    // Print the first 10 numbers in a fibonacci series
    /**public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = 0, b = 1;
            int count = obj.nextInt();
            System.out.print(a + " " + b);
            for (int i = 2; i <= count; i++) {
                int d = a + b;
                System.out.print(" " + d);
                a = b;
                b = d;
            }
        }
    } **/

    // Print the fibonacci series from 1 to 100
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)){
            int a = 0, b = 1, ni = obj.nextInt();
            while (a <= ni) {
                int n = a + b;
                System.out.print(a + " ");
                a = b;
                b = n;
            }
        }
    } 
}
