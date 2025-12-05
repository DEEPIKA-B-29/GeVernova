package Dayone;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=obj.nextInt();
        if(n<31 && n>=0){
            for(int i=0;i<=n;i++) {
                double pow = Math.pow(2, i);
                System.out.println(i+"="+pow);
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
