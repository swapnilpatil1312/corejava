package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p1=new Point2D(1,2);
		p1.getDetails();
		
		Point2D p2=new Point2D(2,3);
		
		
		System.out.println(p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.print("both point are same ");
		}
		else
		{
			p1.calculateDistance(p2);
		}
		
		
				
		
		
		

	}

}
