package InformaticsHw.C;

import java.util.Scanner;
public class cutApple2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = k%n;
        System.out.println(x);
    }
}
