package java_Basic_Interview_Codes;

import java.util.Scanner;

public class ReverseOfAString {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String s = obj.next();
            String rev = "";
            for (int i = s.length() - 1; i >= 0; --i) {
                rev = rev + s.charAt(i);
            }
            System.out.print(rev);
        }
    }
}
