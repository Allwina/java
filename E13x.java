package myjava;
import java.util.Random;
class EvenThread extends Thread
{ int s;
	 EvenThread(int a)
	{
		s=a;
	}
   public void run()
	{
	//square
		System.out.println("square of"+s+"  ="+s*s);
	}
}
class OddThread extends Thread
{
int g;
OddThread(int b)
{
	g=b;
}
	public void run()
	{
	//cube
	System.out.println("Cube of"+g+" ="+g*g*g);
	}
}
class RandThread extends Thread
{
public void run()
	{ 
	Random r=new Random();
	for(int i=1;i<=10;i++)
	{
	int n=r.nextInt(100);
	
	if (n%2==0)
	{
		EvenThread t=new EvenThread(n);
		t.start();
		
	}
	else
	{
		OddThread o=new OddThread(n);
		o.start();
	}
	
	}
}
}
public class E13x {
public static void main(String args[])
	{
	RandThread r = new RandThread();
	r.start();
	
	}
}



