package Basics;

import java.util.Scanner;

public class carpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        int b;
        System.out.println("Enter the length: ");
        l=sc.nextInt();
        System.out.println("Enter the breath: ");
        b=sc.nextInt();
        int area=l*b;
        int peri = 2*(l+b);
        System.out.println("Length of rope: "+ peri);
        System.out.println("Quantity of carpet: "+ area);
    }
}
