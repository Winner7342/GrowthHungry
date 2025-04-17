

import java.util.Scanner;
public class cutApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int applesPerStudent = k/n;
        int remainingApples = k % n;
       System.out.println(applesPerStudent);
        System.out.println(remainingApples);

    }
}
