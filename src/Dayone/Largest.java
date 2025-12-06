package Dayone;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int n1,n2,n3;
        n1=obj.nextInt();
        n2=obj.nextInt();
        n3=obj.nextInt();
        if(n1>n2){
            if(n1>n3){
                System.out.println(n1+" is largest");
            }
            else{
                System.out.print(n3+" is largest");
            }
        }
        else{
            if(n2>n3){
                System.out.println(n2+" is largest");
            }
            else{
                System.out.print(n3+" is largest");
            }
        }
    }
}
