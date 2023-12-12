package myjava;
import java.io.*;
import java.util.*;
public class E12X {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
	    FileWriter fin=new FileWriter("oddeven.txt");
		//BufferedReader br=new BufferedReader(fin);
		System.out.println("Enter the data");
		String inp=in.nextLine();
		fin.write(inp);
		FileWriter oddfr=new FileWriter("odd.txt");
		FileWriter evenfr=new FileWriter("even.txt");
		String element[]=inp.split(" ");
		for(String elements:element)
		{
			if((Integer.valueOf(elements))%2==0)
			{
				evenfr.write(elements+" ");
			}
			else
			{
				oddfr.write(elements+" ");
			}
		}
		oddfr.close();
		evenfr.close();
		//even numbers
		FileReader f = new FileReader("even.txt");
		BufferedReader br=new BufferedReader(f);
		String s;
		System.out.println("Contents of even file :");
		while((s=br.readLine()) != null)
		{
		System.out.println(s);
		}
		f.close();
		//odd numbers
		System.out.println("Contents of oddz file :");
		FileReader o = new FileReader("odd.txt");
		BufferedReader b=new BufferedReader(o);
		String st;
		while((st=b.readLine()) != null)
		{
		System.out.println(st);
		}
		o.close();
		
	}

}
