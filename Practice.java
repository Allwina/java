package myjava;
import java.util.*;
import java.io.*;
 public class Practice //implements Runnable //extends Thread
{
/*	 String c;
	 MyThread(String s)
	 {
	 c=s;
	 }
	public void run()
	{
		synchronized (this)
		{
		
		for(int i=1;i<5;i++)
		{
		 System.out.println(c);
		}
		try {
			Thread.sleep(500);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
public class Practice {
	public static void main(String args[])
	{
		MyThread t=new MyThread("allu");
		Thread t1=new Thread(t);
		
		MyThread a=new MyThread("lalu");
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
		//a.start();
	}

}*/
	 public static void main(String[] args) throws FileNotFoundException, IOException {
		 String fileName = "file.txt";
		 File f=new File(fileName);
		 f.createNewFile();
		 FileInputStream fis = new FileInputStream(fileName); 
		 int i=0;
		 //System.out.println(fis.read());
		 char c1 = (char) fis.read();
		 char c2 = (char) fis.read();
		 char c3 = (char) fis.read();
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		 while((i=fis.read())!=-1) {
			//Converts Byte to Character
			char c = (char)i;
			System.out.print(c);
		 
		 }
		}
}
