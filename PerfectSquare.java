package myjava;
import java.util.*;
public class PerfectSquare {
	public static void main(String[] args)
		{
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter the number :");
		  int num = scan.nextInt();
		  
		  double root = Math.sqrt(num);
		  if((Math.floor(root) - root)==0)
		   {
			  System.out.print(num + " is a perfect square number");
		   }
		  else
		  {
			  System.out.print(num + " is not a perfect square number");
		  }
	      scan.close();
		}

	}

