package Anudip.Loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i; 
        }

        System.out.println("Sum of natural numbers up to " + num + " is: " + sum);
        sc.close();
    }
}
