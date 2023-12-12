package myjava;
import java.io.*;
import java.util.*;
public class Nread {
	public static void main(String args[])throws IOException
	{
    Scanner in=new Scanner(System.in);
	File f=new File("nread.txt");
	f.createNewFile();
	System.out.println(" Enter the total numbers");
	int n=in.nextInt();
	FileOutputStream fin=new FileOutputStream("nread.txt");
	System.out.println("Enter the data in");
	for(int i=0;i<n;i++)
	{
		int inp=in.nextInt();
		fin.write(inp);
	}
	
		fin.close();
		int i=0;
        FileInputStream r=new FileInputStream("nread.txt");
		
		while((i=r.read())!=-1)
		{
			int c=(int)i;
			System.out.print(c);
			}
		r.close();
}
}
