package primepackage;
import java.util.*;

public class TFC 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,b,n;
		System.out.println("Enter a");
		a=in.nextInt();
		System.out.println("Enter B");
		b=in.nextInt();
		try
		{
			n=a/b;
			System.out.println(n);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ by 0");
		}
        finally
        {
        	System.out.println("End");
        }
    }
}