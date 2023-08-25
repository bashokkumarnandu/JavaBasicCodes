package java_Basic_Interview_Codes;

import java.util.Scanner;

public class FourthCharacterFromTheString {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String s = obj.next();
            System.out.print(s.charAt(4));
        }
    }
}
