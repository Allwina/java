package myjava;
import java.util.*;
abstract class Marks
{
	abstract void getPercentage();
	
}
class A extends Marks
{
	float m1,m2,m3;
	A(float a,float b,float c)
	{
		m1=a;
		m2=b;
		m3=c;
	}
	void getPercentage()
	{
	System.out.println("Percentage of A is "+(m1+m2+m3)/3);
		
	}
}
class B extends Marks
{
	float m1,m2,m3,m4;
	B(float a,float b,float c,float d)
	{
		m1=a;
		m2=b;
		m3=c;
		m4=d;
	}
	void getPercentage()
	{
	System.out.println("Percentage of B is"+(m1+m2+m3+m4)/4);
		
	}
}
public class stu {
	public static void main(String args[])
	{
		float p,q,r,s,t,u,v;
	Scanner in=new Scanner(System.in);
			
	System.out.println("enter the marks of A");
	p=in.nextFloat();
	q=in.nextFloat();
	r=in.nextFloat();
	System.out.println("enter the marks of B");
	s=in.nextFloat();
	t=in.nextFloat();
	u=in.nextFloat();
	v=in.nextFloat();
	A a = new A(p,q,r);
	B b = new B(s,t,u,v);
	a.getPercentage();
	b.getPercentage();
	

}
}