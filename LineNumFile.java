package myjava;
import java.io.*;
import java.util.*;
public class LineNumFile {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
		String s;
		FileWriter w=new FileWriter("linenum.txt",true);
		
			System.out.println("enter the line");
			s=in.next();
		    w.write(" "+s +"\n");
	
		
		w.close();
		//reading
		FileReader fr = new FileReader("linenum.txt");
		BufferedReader br=new BufferedReader(fr);
		String r="";int i;
		 LineNumberReader linereader = new LineNumberReader(fr);

         System.out.println("Contents in file are:");

         while((i=linereader.read())!=-1)

{

             System.out.print((linereader.getLineNumber()+1));

             System.out.println((char)i+linereader.readLine());

         }

             
         }
	}
	

