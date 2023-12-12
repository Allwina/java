package myjava;
import java.util.*;
import java.io.*;
class NumberMaker
{
	int r,c;
	Scanner in=new Scanner(System.in);
	
			public int[][] createTestData()
			{
				System.out.println("enter the number of rows");
				 r=in.nextInt();
				System.out.println("enter the number of columns");
				 c=in.nextInt();
				int b[][]=new int[r][c];
				
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						System.out.println("enter the data");
						b[i][j]=in.nextInt();
						
					}
				}
				return b;
			}

	       public void writeData(int[][] testData, String fileName)
	       {
		    	   
		    	  
		    	   try
		    	   {
		    		   FileWriter w=new FileWriter(fileName,true);
		    	   
		    	  
		    	   for(int i=0;i<testData.length;i++)
					{
						for(int j=0;j<testData[i].length;j++)
						{
						w.write(String.valueOf(testData[i][j])+"\t");	
							
						}
						//System.out.println();
						w.write(System.getProperty("line.separator"));
					}
		    	   w.close();
		    	   
		       }catch(Exception e)
		    	   {
		    	   System.out.println(e);
		    	   }
	       }
	        public void readData(String fileName)
	        {
	        	try
	        	{
		        	FileReader read=new FileReader(fileName);
		        	BufferedReader br=new BufferedReader(read);
		        	String st;
		        	while((st=br.readLine())!=null)
		        	{
		        		System.out.println(st);
		        	}
		        	read.close();
	            }
	        	catch(Exception e)
	        	{
	        	      System.out.println(e);
	        	}
	
          }
}
public class Driver {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
		NumberMaker n=new NumberMaker();
		int a[][]=n.createTestData();
		System.out.println("enter the file name:");
		String s=in.nextLine();
		System.out.println("enter the file name to read:");
		String st=in.nextLine();
		n.writeData(a, s);
		n.readData(st);
		
	}

}
