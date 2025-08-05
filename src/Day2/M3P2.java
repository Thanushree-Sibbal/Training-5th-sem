package Day2;

import java.util.Scanner;

public class M3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("liters: ");
        int l = sc.nextInt();
        double bill=0.0;
        if(l<=100){
            bill=l*2.0;
        }
        else if(l<=500){
            bill=100*2.0+(l-100)*1.5;
        }
        else if(l>500){
            bill = 100*2.0+400*1.5+(l-500)*1;
        }
        System.out.println("Bill: "+bill);

    }
}
