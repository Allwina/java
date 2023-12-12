package primepackage;
import java.util.*;
public class PRIME {
	
	 public static int prime(int n)
	{
		int c=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		
		return  c;
		
		
	}
}