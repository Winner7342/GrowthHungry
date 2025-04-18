package myPractice.GptPractice;
import java.util.Scanner;
public class While {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        while (a >= 0) {
            System.out.println(a);
            a--;

        }
    }
}
