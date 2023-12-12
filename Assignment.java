package myjava;
import java.io.*;
public class Assignment
{
	public static void main(String args[])throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		File f=new File("MyNewFile.txt");
		f.createNewFile();
		FileWriter W
		= new FileWriter("MyNewfile.txt");
		W.write(
		"\n  * 10 20 30 40 50 \n * 60 70 80 90 100\n * 200 500 60 75 10");
		W.close();
		System.out.println("Enter file name");
		String s=br.readLine();
		int i=0,a=1;
		FileInputStream fin=new FileInputStream(s);
		
		
		while((i=fin.read())!=-1)
		{
			
			
			char c=(char)i;
			if((c==('*')))
					{
						System.out.print(a);
						a++;
						c=' ';
					}
			System.out.print(c);
			
		}
		

		
	}

}
