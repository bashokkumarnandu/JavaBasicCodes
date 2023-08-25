package java_Basic_Interview_Codes;

import java.util.Scanner;

public class ArmstrongNumber {
	
    // Check whether 153 is a Armstrong Number or not
	/**public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int B = n;
     * int A = 0;
     * while (n > 0) {
     * int r = n % 10;
     * A = A + (r * r * r);
     * n = n / 10;
     * }
     * if (A == B) {
     * System.out.print("Armstrong Number");
     * } else {
     * System.out.print("Not a Armstrong Number");
     * }
     * }
     **/

    // Check whether 153 & 15 are Armstrong or not
    /**
     * public static void main(String[] args) {
     * try (Scanner sc = new Scanner(System.in)) {
     * int n = sc.nextInt();
     * int A = n;
     * int B = n;
     * int count = 0, Arm = 0;
     * while (n > 0) {
     * n = n / 10;
     * count++;
     * }
     * while (A > 0) {
     * int r = A % 10;
     * Arm = Arm + (int) Math.pow(r, count);
     * A = A / 10;
     * }
     * if (Arm == B) {
     * System.out.print("Armstrong Number");
     * } else {
     * System.out.print("Not a Armstrong Number");
     * }
     * }
     * }
     **/

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t2, t1, d = 0, Arm = 0;
            for (int i = a; i <= b; i++) {
                t2 = i;
                t1 = i;
                while (t1 > 0) {
                    t1 = t1 / 10;
                    ++d;
                }
                while (t2 > 0) {
                    int rem = t2 % 10;
                    Arm = Arm + (int) Math.pow(rem, d);
                    t2 = t2 / 10;
                }
                if (Arm == i) {
                    System.out.print(i + " ");
                }
                d = 0;
                Arm = 0;
            }
        }
    }
}
