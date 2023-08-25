package java_Basic_Interview_Codes;

import java.util.Scanner;

public class PrimeNumber {

    // Check whether the number is Prime or not using factors count
    /**
     * public static void main(String[] args) {
     * try (Scanner sc = new Scanner(System.in)) {
     * int n = sc.nextInt();
     * int fact = 0;
     * if (n == 0 || n == 1) {
     * System.out.print("Not a Prime Number");
     * } else {
     * for (int i = 2; i <= n; i++) {
     * if (n % i == 0) {
     * fact++;
     * }
     * }
     * if (fact == 1) {
     * System.out.print("Prime Number");
     * } else {
     * System.out.print("Not a Prime Number");
     * }
     * }
     * }
     * }
     **/

    // Check whether the number is Prime or not without using factors count
    /**
     * public static void main(String[] args) {
     * try (Scanner sc = new Scanner(System.in)) {
     * int n = sc.nextInt();
     * int i;
     * if (n == 0 || n == 1) {
     * System.out.print("Not a Prime Number");
     * } else {
     * for (i = 2; i <= n; i++) {
     * if (n % i == 0) {
     * break;
     * }
     * }
     * if (n == i) {
     * System.out.print("Prime Number");
     * } else {
     * System.out.print("Not a Prime Number");
     * }
     * }
     * }
     * }
     **/

    // Print the prime numbers between 1 to 10 without using factor count
    /**
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int i, j;
     * for (i = a; i <= b; i++) {
     * for (j = 2; j <= i; j++) {
     * if (i % j == 0) {
     * break;
     * }
     * }
     * if (i == j) {
     * System.out.print(i);
     * }
     * }
     * }
     **/

    // Print the prime numbers between 1 to 10 using factor count
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i, j;
            for (i = a; i <= b; i++) {
                int fact = 0;
                for (j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        fact++;
                    }
                }
                if (fact == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
