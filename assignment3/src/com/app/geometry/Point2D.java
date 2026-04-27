package com.app.geometry;

import java.lang.Math;

import java.util.Scanner;

public class Point2D {
	
	Scanner sc=new Scanner(System.in);

	
		
		double x;
		double y;
		
		
		public Point2D(double x,double y)
		{
			this.x=x;
			this.y=y;
			
		}

		public String getDetails() {

			System.out.println("get x");
			x = sc.nextInt();

			System.out.print("get y");
			y = sc.nextInt();

			return x + " " + y;

		}
		 
		public boolean isEqual(Point2D other)
		
		{
			return this.x==other.x && this.y==other.y;
		}
		
		public void calculateDistance(Point2D other )
		{
			double distance;
			
			distance=Math.sqrt(Math.pow((other.x-this.x),2)+Math.pow((other.y-this.y),2));
			System.out.print(distance);
			
			
		}
		 
	}


