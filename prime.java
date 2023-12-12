package myjava;
import java.util.*;
public class prime {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i, n,c=0;
		System.out.println("Enter the number");
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c=c+1;
		}
		if(c==2)
			System.out.println("prime number");
		else
			System.out.println("Not prime");
		
	}

}
