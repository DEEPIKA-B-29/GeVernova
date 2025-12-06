package Dayone;

import java.util.Scanner;

public class Vowel{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        char s=obj.next().charAt(0);
        if(s=='a' || s=='A' || s=='e' || s=='E' || s=='i' || s=='I' || s=='O' || s=='o' || s=='u' || s=='U'){
            System.out.println(s+" is vowel");
        }
        else{
            System.out.println(s+" is consonant");
        }
    }
}