package assignment1;
import java .util.*;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		
		String binary= Integer.toBinaryString(num);
		System.out.print(binary);
		
		String octal=Integer.toOctalString(num);
		System.out.println(octal);
				
	    String hexa=Integer.toHexString(num);
	    System.out.println(hexa);

	}

}
