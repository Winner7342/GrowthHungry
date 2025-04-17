package Week2.javaClass;

import java.util.Random;
import java.util.Scanner;
public class randomNumber {
    public static void main(String[]args){
        Random rand = new Random();
        int number = Math.abs(rand.nextInt()) % 100;
        System.out.println(number);
        System.out.println("Enter your guess: ");

        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        if (number == guess) {
            System.out.println("You win!");
        } else {
            if (guess < number) {
                System.out.println("less");
            } else {
                System.out.println("great");
            }
        }
    }
}
