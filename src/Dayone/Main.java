package Dayone;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int t=0;
        int h=0;
        if(n>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative. terminated");
            System.exit(0);
        }
        for(int i=0;i<n;i++){
            double coin=Math.random();
            System.out.println(coin);
            if(coin<0.5){
                t+=1;
            }
            else{
                h+=1;
            }
        }
        double t_per=((double)t/n)*100;
        double h_per=((double)h/n)*100;
        System.out.println(h_per+" "+t_per);
    }
}
