package assignment7;
import java.util.*;

class tolongstingexception extends Exception {
	
	public tolongstingexception() {
		
		super ("error");
	}
	
	
}

public class Q1 {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the string");
			String userInput = sc.nextLine();		
		     
		     
		     int length = userInput.length();
		     System.out.println(length);
		     
		     
		     if(length>80)
		     {
		    	 throw  new tolongstingexception();
		     }
		     System.out.println("string is printed");
		     
		}
		catch
			 ( tolongstingexception e){
	           
	            System.out.println(e.getMessage());
	        } finally {
	            Scanner scanner = new Scanner(System.in);
				scanner.close();
	        }
		}
		
	}


