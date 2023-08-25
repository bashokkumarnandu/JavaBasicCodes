package java_Basic_Interview_Codes;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float F=sc.nextFloat();
            float c=(F-32);
            float d=(float) (c / 1.8);
            System.out.println(d+" C");
        }
    }
}
