package Dayone;

import java.util.Scanner;

public class QuoRem {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int dividend=obj.nextInt();
        int divisor=obj.nextInt();
        if(divisor!=0){
            int q=dividend/divisor;
            int r=dividend%divisor;
            System.out.println("Quotient "+q);
            System.out.println("Remainder  "+r);
        }
    }
}
