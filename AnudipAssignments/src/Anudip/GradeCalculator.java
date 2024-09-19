package Anudip;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Marks...");
		int marks = sc.nextInt();
		
		if(marks>=90)
		{
			System.out.println("Your Grade is: A");
		} else if(marks<=80)
		{
			System.out.println("Your Grade is: B");
		} else if(marks<=70)
		{
			System.out.println("Your Grade is: C");
		}  else if(marks<=60)
		{
			System.out.println("Your Grade is: D");
		}  else if(marks<=40)
		{
			System.out.println("Your Grade is: F");
			System.out.println("You are Fail");
		}
	}

}
