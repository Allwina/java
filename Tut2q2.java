package myjava;
import java.io.*;
import java.util.*;

	class OddNumber extends Thread{
		public void run(){  
			try
			{
			FileWriter o=new FileWriter("odd.txt",true);
			for(int i=1;i<=100;i+=2) {
				System.out.println("Odd Number Generated"+i);
				o.write(String.valueOf(i)+" ");
				//o.close();
			}o.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	class EvenNumber extends Thread{
		public void run(){ 
			try
			{
			FileWriter e=new FileWriter("even.txt",true);
			for(int i=0;i<=100;i+=2)
				{
					System.out.println("Even Number Generated"+i);
					e.write(String.valueOf(i)+" ");
					//e.close();
				}e.close();
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	}
	public class Tut2q2 {
		public static void main(String[] args)throws IOException
		{
			OddNumber oddNumbers = new OddNumber();
			EvenNumber evenNumbers = new EvenNumber();
			

			oddNumbers.start();
			evenNumbers.start();
		}

	}



