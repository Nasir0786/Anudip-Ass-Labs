package Anudip.Loops;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		System.out.println("Enter Your Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean IsPrime = true;
		if(num<=1)
		{
			IsPrime = false;
		} else 
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					IsPrime = false;
					break;
				}
			}
		}
		if(IsPrime)
		{
			System.out.println(num+" "+"Is Prime Number");
		} else {
			System.out.println(num+" "+"Is Not Pime");
		}
		sc.close();
	}
}
