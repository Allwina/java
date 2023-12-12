package myjava;
	
	import java.util.*;
	public class freq {

	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	char c;
	int co=0;
	String s=new String();
	System.out.println("enter the sentence");
	s=in.nextLine();
	System.out.println("enter the alphabet");
	c=in.next().charAt(0);

	int l=s.length();
	for(int i=0;i<l;i++)
	{
	if(s.charAt(i)==c)
	{
	co=co+1;
	}
	}System.out.print("the number of times of "+c+" is "+co);

	}


	}

