package assignment8;

import java.util.Scanner;

import assignment8.stack.Stack;

public class testerclass {
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stack stackRef = null;
        boolean exit = false;
        
        
        while(!exit) {
        	System.out.println("1.exit");
        	System.out.println("2.fixed stack");
        	System.out.println("3.groablestck");
        	System.out.println("4.push");
        	System.out.println("5.pop");
        	int choice=sc.nextInt();
        	
        	switch(choice) {
        	
        	case 1:
        		if(stackRef==null)
        		{
        			
        			System.out.println("fixed stack selected");
        			
        			
        			
        		}
        		else
        		{
        			System.out.println("fixed stack not allowed");
        		}
        		
        	case 2:
        		if(stackRef==null)
        		{
        			System.out.println("grawable stack is avable");
        		}
        		else
        		{
        			System.out.println("grawable stack is not allowed");
        		}
        		
        	case 3: 
                if (stackRef != null) {
                    System.out.println("Enter ID, Name, Salary:");
                    stackRef.push(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
                } else System.out.println("Error: NO stack chosen !!!");
                break;

            case 4: 
                if (stackRef != null) {
                    Employee e = stackRef.pop();
                    if (e != null) System.out.println("Popped: " + e);
                } else System.out.println("Error: NO stack chosen !!!");
                break;

            case 5:
                exit = true;
                break;

            default:
                System.out.println("Invalid input!");
        }
    }
    sc.close();
        		
        		
        		
        		
        	}
        	
        
        	



        	
        
{
        
        
        
       
	}

}
