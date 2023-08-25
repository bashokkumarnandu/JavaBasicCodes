package java_Basic_Interview_Codes;

import java.util.Scanner;

public class LengthOfAString {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String a = obj.next();
            System.out.println(a.length());
        }
    }
}
