package java_Basic_Interview_Codes;

import java.util.Scanner;

public class ReadingInputFromKeyboard2{
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
          String s=obj.nextLine();
          byte b=obj.nextByte();
          // short sh=obj.nextShort();
          // int i=obj.nextInt();
          // long l=obj.nextLong();
          // float f=obj.nextFloat();
          // double d=obj.nextDouble();
         //  boolean bo=obj.nextBoolean();
          System.out.print(s+" "+b);
        }
    }
}