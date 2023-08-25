package java_Basic_Interview_Codes;

import java.util.Scanner;

public class Powers {

    /**
    public static void main(String[] args) {
     * try (Scanner obj = new Scanner(System.in)) {
     * int n = obj.nextInt();
     * int x = obj.nextInt();
     * switch (x) {
     * case 1:
     * int a = n * (x);
     * System.out.print(a);
     * break;
     * case 2:
     * int b = n * (x * x);
     * System.out.print(b);
     * break;
     * case 3:
     * int c = n * (x * x * x);
     * System.out.print(c);
     * break;
     * case 4:
     * int d = n * (x * x * x * x);
     * System.out.print(d);
     * break;
     * case 5:
     * int e = n * (x * x * x * x * x);
     * System.out.print(e);
     * break;
     * }
     * }
     * } 
     **/

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int x = obj.nextInt();
            int c = (int) Math.pow(n, x);
            System.out.println(c);
        }
    }
}
