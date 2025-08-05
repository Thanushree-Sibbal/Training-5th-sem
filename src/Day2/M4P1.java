package Day2;

import java.util.Scanner;

public class M4P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        String sqStr = Integer.toString(sq);
        boolean found = false;
        for (int i =1;i<sqStr.length();i++){
            String leftStr =sqStr.substring(0,i);
            String rightStr =sqStr.substring(i);
            int left = Integer.parseInt(leftStr);
            int right = Integer.parseInt(rightStr);
            if(right!=0 && left+right == n){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}
