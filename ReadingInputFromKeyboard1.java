package java_Basic_Interview_Codes;

public class ReadingInputFromKeyboard1{
    public static void main(String[] args) {
        System.out.print("What is your name?");
        String a=System.console().readLine();
        System.out.print("My name is " + a);
    }
}
