package Anudip;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Enter Your Nukmber: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" "+"Number is Even");
		} else 
		{
			System.out.println(num+" "+"Number is Odd");
		}
		sc.close();
	}
}
