package InformaticsHw.C;


import java.util.Scanner;
public class  gp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
sum += x;
        }
        System.out.println("Full amount of number is " + sum);
    }
}