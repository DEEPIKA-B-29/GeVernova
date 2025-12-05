package Dayone;

import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year");
        int y=obj.nextInt();
        if(y>999 && y<10000){
            if((y%4==0 && y%100!=0) || (y%400==0)){
                System.out.println(y+" Leap year");
            }
            else{
                System.out.println(y+" Not a leap year");
            }
        }
    }
}
