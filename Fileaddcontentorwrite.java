package myjava;
import java.io.*;
public class Fileaddcontentorwrite {
	public static void main(String args[])throws IOException
	{
		String source="welcome ballwina";
		/*char buffer[]=new char[source.length()];
		source.getChars(0, source.length(),buffer,0);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter data");
		//String buffer =br.readLine();*/
		FileWriter f1=new FileWriter("test.txt",true);
		f1.write(source);
		System.out.println("file contents added");
		f1.close();
}
}
