package Day2;

import java.util.Scanner;

public class M4P2 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (!isPrime(digit)) {
                sum += digit;
            }
            n /= 10;
        }

        System.out.println(sum);

    }
}
