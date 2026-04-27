package assignment8Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Spliterator;

public class arraylist {
	
	public static void main1 (String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3);
		a.add(7);
		
		Collections.sort(a);
		
		System.out.println(a);

		
	}
	public static void main (String[] args) {
		
		ArrayList<String> a=new ArrayList<>();
		
		a.add("s");
		a.add("b");
		a.add("c");
		a.add("e");
		
		
		System.out.println("before the sorting:"+a);
		
		
		
		
		Collections.sort(a);
		int n=a.size();
	
		
		

		System.out.println("after the sorting:"+a);
		System.out.println("size is :"+n);

		
		
		
		
	}

}
