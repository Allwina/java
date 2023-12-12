package myjava;
import java.util.*;

import java.io.*;
public class StringTok 
{
	public static void main(String args[])
	{
		     int s=0;
		     String r;
		     int v;
		   //  String digit=in.nextLine();
			 Scanner in=new Scanner(System.in);
			 System.out.println("\nEnter sequence of integers with space b/w them: ");
			 // String digit=in.nextLine();
			 String digit=in.nextLine();
			    StringTokenizer st = new StringTokenizer(digit," ");
			    
			   System.out.println("Entered digits");
			    while (st.hasMoreTokens()) 
			    {
			    //System.out.print(st.nextToken()+" ");
			       r=st.nextToken();
			      v=Integer.valueOf(r);
			     // System.out.print(v+" ");
			      s=s+v;
			     
			     }
			     System.out.println();
			     System.out.println("sum ="+s);
		}
	}