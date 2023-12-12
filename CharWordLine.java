package myjava;
import java.io.*;
public class CharWordLine {
public static void main(String args[])throws IOException
{
	FileReader fr = new FileReader("linenum.txt");
	BufferedReader br=new BufferedReader(fr);
	String s;
	int space=0,line=0,character=0;
	while((s=br.readLine()) != null)
	{ line++;
		for(int i=0;i<s.length();i++)
		{
	     
			if(s.charAt(i)==' ')
			{
				space++;
			}
			else
			{
				character++;
			}
	}
	}System.out.println("space="+space);
	System.out.println("line="+line);
	System.out.println("character="+character);
	}
}
