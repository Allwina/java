package myjava;
import java.util.*;
import primepackage.*;
//static int  prime (int);
public class primepackage {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		static int a;
		 static int b;
		System.out.println("Enter the number to be checked");
		a=in.nextInt();
		b= prime(a);
		if (b==1)
			System.out.println("prime number");
		else
			System.out.println("NOT PRIME");
	}

	/*private static int prime(int a) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	
}
