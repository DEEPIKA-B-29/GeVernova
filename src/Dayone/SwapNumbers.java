package Dayone;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 2 Numbers");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Numbers before swapping: a,b "+ a+","+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swapping: a,b "+ a+","+b);
    }
}
