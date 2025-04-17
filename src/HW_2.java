import java.util.Scanner;
public class HW_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int next = n + 1;
        int prev = n - 1;
        System.out.println("The next number for the number " + n + " is " + next + ".");
        System.out.println("The previous number  the number " + n + " is " + prev + ".");

    }
}