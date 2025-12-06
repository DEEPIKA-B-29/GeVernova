package Dayone;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();

        System.out.println("Prime factors of " + n + " are:");
        primeFactors(n);
    }

    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
    }
}

