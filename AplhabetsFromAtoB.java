package java_Basic_Interview_Codes;

import java.util.Scanner;

public class AplhabetsFromAtoB {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            char n1 = obj.next().charAt(0);
            char n2 = obj.next().charAt(0);
            for (char i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
