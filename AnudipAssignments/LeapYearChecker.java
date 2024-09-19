package Anudip;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		System.out.println("Enter Year want to Check.....");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+" "+"is a Leap Year");
				} else 
				{
					System.out.println(year+" "+"is not a Leap Year");
				}
			} else 
			{
				System.out.println(year+" "+"is not a Leap Year");
			}
		} else 
		{
			System.out.println(year+" "+"is not a Leap Year");
		}
		sc.close();
	}
}
