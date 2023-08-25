package java_Basic_Interview_Codes;

import java.util.Scanner;

public class ConcatanateTwoStrings {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String n1 = obj.next();
            String n2 = obj.next();
            System.out.print(n1 + " " + n2);
        }
    }
}
