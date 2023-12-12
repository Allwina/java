package myjava;

import java.io.*;

public class FWrite {
	public static void main(String[] args)throws IOException
	{
		//File f=new File("test.txt");
		
		FileOutputStream fout=new FileOutputStream("test.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String s="Hi Allwina";
		System.out.println("Enter the data");
		String s=br.readLine();
		byte[] a=s.getBytes();
		//char ch[]=s.toCharArray();
		fout.write(a);
		/*for(int i=0;i<s.length();i++)
		{
			//fout.write(ch[i]);
			
			
		}*/System.out.println("Data added");
	

}
}