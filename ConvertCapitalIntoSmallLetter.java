package java_Basic_Interview_Codes;

import java.util.Scanner;

public class ConvertCapitalIntoSmallLetter {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            String n = obj.next();
            System.out.print(n.toLowerCase());
        }
    }
}
