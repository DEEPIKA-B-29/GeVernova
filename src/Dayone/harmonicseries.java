package Dayone;

import java.util.Scanner;

public class harmonicseries {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        double sum=0.0;
        if(n!=0){
            for(int i=1;i<=n;i++){
                sum+=1.0/i;
            }
        }
        //sum=(double) sum;
        System.out.println("Sum: "+sum);
    }
}
