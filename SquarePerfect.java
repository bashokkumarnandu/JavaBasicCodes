package java_Basic_Interview_Codes;

import java.util.Scanner;

public class SquarePerfect {

    // Print the square root of 16
    /**
     * public static void main(String[] args) {
     * Scanner sc=new Scanner(System.in);
     * int n=sc.nextInt();
     * int Square=(int)Math.sqrt(n);
     * System.out.println(Square);
     * }
     **/

    // Check whether the number is perfect square or not
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int Square = (int) Math.sqrt(n);
            if (Square * Square == n) {
                System.out.print("Pefect Square");
            } else {
                System.out.print("Not a Pefect Square");
            }
        }
    }
}
