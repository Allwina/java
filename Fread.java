package myjava;

import java.io.*;

public class Fread {
	public static void main(String[] args)throws IOException
	{
		int i=0;
		FileInputStream fin=new FileInputStream("test.txt");
		System.out.println(fin.available());
		while((i=fin.read())!=-1)
		{
			char c=(char)i;
			System.out.print(c);
		}
		
}
}