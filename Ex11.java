package myjava;
import java.util.*;
import java.io.*;
public class Ex11 {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
	File f=new File("sample.txt");
	f.createNewFile();
	FileWriter W = new FileWriter("sample.txt");
	System.out.println("Enter the data");
	String s=in.nextLine();
	W.write(s);
	W.close();
	//new file
	File n=new File("new-sample.txt");
	n.createNewFile();
	FileReader fr = new FileReader("sample.txt");
    FileWriter  fw=new FileWriter("new-sample.txt",true);
	int c;  
	while ((c = fr.read()) != -1)
	{  
	 fw.write(c);  
	}  
	System.out.println("Copy finish...");  
	fr.close();  
	fw.close(); 
	
	//new content
	FileReader fq = new FileReader("new-sample.txt");
	BufferedReader b=new BufferedReader(fq);
	String str;
	System.out.println("The copied content is");
	while((str=b.readLine()) != null)
	{
	
		System.out.print(str);
	}
	
	fq.close();


}
}
