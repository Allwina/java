package myjava;
import java.util.*;

public class Integer {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int pn=0,nn=0,on=0,en=0,zn=0;
		int a[]=new int[20];
		for(int i=0;i<20;i++)
		{
			System.out.println("enter the numbers");
			a[i]=in.nextInt();
			
		}
		for(int i=0;i<20;i++)
		{
			// positive numbers
			if(a[i]>0)
			{
				pn=pn+1;
			}
			if(a[i]<0)
			{
				pn=pn+1;
			}
			if(a[i]%2==0)
			{
				en=en+1;
			}
			if(a[i]%2!=0)
			{
				on=on+1;
			}
			if(a[i]==0)
			{
				zn=zn+1;
			}
		}
		System.out.println("number of positive number ="+pn);
		System.out.println("number of negative number ="+nn);
		System.out.println("number of odd number ="+on);
		System.out.println("number of even number ="+en);
		System.out.println("number of 0 number ="+zn);


	}

	public static int valueOf(String elements) {
		// TODO Auto-generated method stub
		return 0;
	}
}
