/**
 * 
 */
/**
 * @author Allwina
 *Develop a java package named primepackage hod that with a class Prime containing a static method that check whether a number is prime or not and returns that information .
 *Import this package in another class and use to check A number is prime or not.
 */
package primepackage;
import java.util.*;
 class Prime
{
	 static int c=0;
	 
	private static int Prime(int n)
	{
		
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		
		return  c;
		
		
	}
}