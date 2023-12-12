package myjava;
import java.util.*;
 class overare {
	 void area(float ba,float he)
		{
			double area=ba*he/2;
			System.out.println("Area of Triangle with base:"+ba+" and height:"+he+" is:   ="+area);
		}
	 void area(double l,double b)
		{
			double area=l*b;
			System.out.println("Area of Rectangle with width: "+b+" and length:"+l+"  is:   ="+area);
			
		}
		
	void area(double radius)
	{
		double area=3.14*radius*radius;
		System.out.println("Area of Circle with radius "+radius+"is :" +area);
		
		
	}
	

}
public class overarea
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		overare ob=new overare();
		double r,length,breadth;
		float base,height;
		System.out.println("enter the radius of circle");
		 r=in.nextDouble();
		System.out.println("enter the length of rectangle");
		 length=in.nextDouble();
		System.out.println("enter the breadth of rectangle");
	     breadth=in.nextDouble();
		System.out.println("enter the base of triangle");
		 base=in.nextFloat();
		System.out.println("enter the height of triangle");
		 height=in.nextFloat();
		
		
		 ob.area(base,height);
		 ob.area(length,breadth);
		ob.area(r);
		
		
	}
}
