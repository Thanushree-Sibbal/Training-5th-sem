package Day2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two digit number");
        int n = sc.nextInt();
        int sum =0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
        /*int a,b;
        a = n/10;
        b = n%10;
        System.out.println(a+b);*/


    }
}
