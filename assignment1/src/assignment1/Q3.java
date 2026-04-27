package assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    int choice ;
	    int quantity;
	    boolean ordering =true;
	    double totalbill=0;
	    
		
		
		
		double dosa=50.00;
		double samosa=60.00;
		double idli=70.00;
		double patice=80.00;
		double bhel=90.00;
		double panipuri=100;
		
		
		
		
		while(ordering){
			System.out.println("enter the choice");
			System.out.println("1.ender the dosa ");
			System.out.println("2.enter the idli");
			System.out.println("3.enter the patice");
			System.out.println("4.enter the bhel");
			System.out.println("5.enter the panipuri");
			System.out.println("enter the choice no :");
			
			
			
		
	choice=sc.nextInt();
		
	switch(choice) {
	
	case 1:
	{
		System.out.println("enter the dosa ");
		quantity=sc.nextInt();
		totalbill= quantity*dosa;
		break;	
		
	}
	case 2:
	{
		System.out.println("enter the samosa ");
		quantity=sc.nextInt();
		totalbill= quantity*samosa;
		break;
	
	
	
	}
	case 3:
	{
		System.out.println("enter the idli ");
		quantity =sc.nextInt();
		totalbill= quantity*idli;
		break;
	}
	case 4:
	{
		System.out.println("enter the patice ");
		quantity=sc.nextInt();
		totalbill= quantity*patice;
		break;
	}
	case 5:
	{
		System.out.println("enter the bhel ");
		quantity=sc.nextInt();
		totalbill= quantity*bhel;
		break;
	}
	case 6:
	{
		System.out.println("enter the panipuri ");
		quantity=sc.nextInt();
		totalbill= quantity*panipuri;
		break;
	}

}
	sc.close();
	}
	}
}

	
