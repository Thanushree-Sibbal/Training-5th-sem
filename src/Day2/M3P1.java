package Day2;

import java.util.Scanner;

public class M3P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock price a month ago");
        float stock = sc.nextFloat();
        System.out.println("Enter the current stock price");
        float c_stock= sc.nextFloat();
        float change = ((c_stock-stock)/stock)*100;
        if(change>10.0){
            System.out.println("Buy");
        }
        else if(change >=5.0){//change>=5.0 && change <=10.0
            System.out.println("Hold");
        }
        else if(change < -5.0){
            System.out.println("Sell");
        }
        else{
            System.out.println("hold");
        }
        /*if(c_stock>0.1*stock+stock){
            System.out.println("Buy");
        }
        else if(c_stock>=0.05*stock+stock || c_stock<=0.1*stock+stock){
            System.out.println("Hold");
        }
        else if(c_stock < 0.05*stock+stock){
            System.out.println("Sell");
        }*/

    }
}
