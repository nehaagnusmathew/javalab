package javalab;

import java.util.Scanner;

class Area
{
	void area(double radius)
	{
		double z=3.14*radius*radius;
		System.out.println("area of circle :"+z+" sq units");
	}
	void area(int length,int breadth)
	{ 
		int a=length*breadth;
		System.out.println("area of rectangle :"+a+" sq units");
	}
	void area(double base,double height)
	{
		double b=0.5*base*height;
		System.out.println("area of triangle :"+b+" sq units");
	}
}
class Methodoverloading
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Area obj=new Area();
		
		System.out.println("enter the radius of circle");
		double radius=sc.nextDouble();
		obj.area(radius);
		System.out.println("enter the length and breadth of rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		obj.area(length,breadth);
		System.out.println("enter the base and height of triangle");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		obj.area(base,height);
		sc.close();
				
	}
}


	
