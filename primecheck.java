package myjava;
import primepackage.*;
import java.util.*;

public class primecheck {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		
		int g,e;
		System.out.println("Enter the number to be checked");
		g=in.nextInt();
		e=PRIME.prime(g);
		if(e>2)
			System.out.println("Not prime");
		else
			System.out.println("Prime");
		
	}

	
	}


