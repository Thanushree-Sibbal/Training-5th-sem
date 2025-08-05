package Basics;

import java.util.Scanner;

public class letters {
    public static void display(int n){
        char result =(char)n;
        System.out.println(n+"="+ result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        for(int i=0;i<4;i++) {
            System.out.println("Enter a number");
            n=sc.nextInt();
            letters.display(n);
        }

    }
}
