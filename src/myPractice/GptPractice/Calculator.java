package myPractice.GptPractice;


import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int sum = a + b;
 int difference = a - b;
 int difference2 = a * b;
 int difference3 = a / b;
 int difference4 = a % b;


 System.out.println(a + "+" + b + "=" + sum);
        System.out.println(a + "-" + b + "=" + difference);
        System.out.println(a + "*" + b + "=" + difference2);
        System.out.println(a + "/" + b + "=" + difference3);
        System.out.println(a + "%" + b + "=" + difference4);

    }
}