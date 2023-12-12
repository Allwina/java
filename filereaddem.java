package myjava;
import java.io.*;
public class filereaddem {
	public static void main(String args[])throws IOException
	{
		FileReader fr =new FileReader("test.txt");
		BufferedReader br =new BufferedReader(fr);
		String s;
		while((s=br.readLine())!= null)
		{
			System.out.println(s);
		}
		fr.close();
	}
}
