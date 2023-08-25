package java_Basic_Interview_Codes;

import java.util.Scanner;

public class PalindromeNumber {

    // Check whether the number is Palindrome or not
    /**
     * public static void main(String[] args) {
     * try (Scanner obj = new Scanner(System.in)) {
     * int n = obj.nextInt();
     * int P = n;
     * int Pal = 0;
     * while (n != 0) {
     * int r = n % 10;
     * Pal = (Pal * 10) + r;
     * n = n / 10;
     * }
     * if (Pal == P) {
     * System.out.print("Palindrome Number");
     * } else {
     * System.out.print("Not a Palindrome Number");
     * }
     * }
     * }
     **/

    //Print Palindrome numbers between 1 to 100 
    /**public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            for (int i = a; i <= b; i++) {
                int Pal = 0;
                int n = i;
                while (n > 0) {
                    int r = n % 10;
                    Pal = (Pal * 10) + r;
                    n = n / 10;
                }
                if (i == Pal) {
                    System.out.print(Pal + " ");
                }
            }
        }
    } **/

    //Print the total count of Palindrome numbers between 1 to 100
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int count=0;
            for (int i = a; i <= b; i++) {
                int Pal = 0;
                int n = i;
                while (n > 0) {
                    int r = n % 10;
                    Pal = (Pal * 10) + r;
                    n = n / 10;
                }
                if (i == Pal) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
