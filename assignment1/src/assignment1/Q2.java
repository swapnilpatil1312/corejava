package assignment1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number");
		double num1=sc.nextInt();
		System.out.print("enter the fsecond number");

		double num2=sc.nextInt();
		if(sc.hasNextDouble())
		{
			System.out.println("it is a bouble ");
			System.out.println("the average is :"+(num1+num2)/2);
		}
		else
		{
			System.out.print("it is not a double value");
		}
		
		
		
		
		
		
	
		 
		

	}

}
