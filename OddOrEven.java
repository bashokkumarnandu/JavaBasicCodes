package java_Basic_Interview_Codes;

import java.util.Scanner;

public class OddOrEven {

    // Wheather the number is even or not
    /**
     * public static void main(String[] args) {
     * Scanner obj=new Scanner(System.in);
     * int a =obj.nextInt();
     * if(a%2==0){
     * System.out.println("Even Number");
     * }else{
     * System.out.println("Odd Number");
     * }
     * }
     **/

    // Print Even & Odd Numbers between 1 to 10
    /**
     * public static void main(String[] args) {
     * Scanner obj=new Scanner(System.in);
     * int a=obj.nextInt();
     * int b=obj.nextInt();
     * for(int i=a;i<=b;i++){
     * if(i%2==0){
     * System.out.println("Even Number"+" "+i);
     * }else{
     * System.out.println("Odd Number"+" "+i);
     * }
     * }
     **/

    // Print even numbers between 1 to 10 and store it in a variable then print
    // alternate numbers from that variable
    /**
     * public static void main(String[] args) {
     * try (Scanner obj = new Scanner(System.in)) {
     * int a=obj.nextInt();
     * int b=obj.nextInt();
     * int count=0;
     * for(int i=a;i<=b;i=i+1){
     * if(i%2==0){
     * int c=i;
     * count++;
     * if(count%2==1){
     * System.out.print(c+" ");
     * }
     * }
     * }
     * }
     * }
     **/

    // sum of even numbers betweem 1 to 10
    /**
     * public static void main(String[] args) {
     * try(Scanner obj=new Scanner(System.in)){
     * int a=obj.nextInt();
     * int b=obj.nextInt();
     * int sum=0;
     * for(int i=a;i<=b;i++){
     * if(i%2==0){
     * sum=sum+i;
     * }
     * }
     * System.out.print(sum);
     * }
     * }
     **/

    // Print the series as below, if a number is even then print the number else *
    /**
     * public static void main(String[] args) {
     * try(Scanner obj=new Scanner(System.in)){
     * int a=obj.nextInt();
     * int b=obj.nextInt();
     * for(int i=a;i<=b;i++){
     * if(i%2==0){
     * System.out.print(i+" ");
     * } else{
     * System.out.print("*"+" ");
     * }
     * }
     * }
     * }
     **/

    // Print the sum of alternate even numbers between 1 to 10
    /**
     * public static void main(String[] args) {
     * try(Scanner obj=new Scanner(System.in)){
     * int a=obj.nextInt();
     * int b=obj.nextInt();
     * int count=0, sum=0;
     * for(int i=a;i<=b;i++){
     * if(i%2==0){
     * int c=i;
     * count++;
     * if(count%2==1){
     * sum=sum+c;
     * }
     * }
     * }
     * System.out.print(sum);
     * }
     * }
     **/

    // Print the Average of even numbers between 1 to 10
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int sum = 0, count = 0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    count++;
                    sum = sum + i;
                }
            }
            int Average = sum / count;
            System.out.print(Average);
        }
    }
}
