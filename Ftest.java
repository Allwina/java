package myjava;
import java.io.*;
public class Ftest {
	public static void main(String[] args)throws IOException
	{
		File f=new File("test.txt");
		if(f.createNewFile())
		{
			System.out.println("created");
		}
		else
		{
			System.out.println("not created");
		}
	}

}
