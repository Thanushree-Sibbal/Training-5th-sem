package Day2;

import java.util.Scanner;

public class M3P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double V1 = sc.nextDouble();
        double V2 = sc.nextDouble();
        double stairTime = (Math.sqrt(2)*N)/V1;
        double elevator_time = 2.0*N/V2;
        if(elevator_time<stairTime){
            System.out.println("Elevator");
        }
        else{
            System.out.println("Stairs");
        }

    }
}
