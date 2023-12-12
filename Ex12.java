package myjava;

import java.util.*;
import java.io.*;
public class Ex12 {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
	    File f=new File("numbers.txt");
	    f.createNewFile();
	    File g=new File("even.txt");
	    g.createNewFile();
	    File h=new File("odd.txt");
	    h.createNewFile();
	    FileOutputStream f1 = new FileOutputStream("numbers.txt");
	    FileOutputStream f2 = new FileOutputStream("even.txt",true);
	    FileOutputStream f3 = new FileOutputStream("odd.txt",true);
	    System.out.println("enter the numbers");
	   String  s = in.nextLine()+" ";
	   int countWord = 0; 
	   int characterCount = 0;
	   FileInputStream fin = new FileInputStream("numbers.txt"); 
	   InputStreamReader ir = new InputStreamReader(fin); 
	   BufferedReader br = new BufferedReader(ir); 
	   String line;
	   while((line = br.readLine()) != null) 
	   { if(!(line.equals(""))) 
	   { 
	  characterCount += line.length(); 
	   String[] wordList = line.split(" ");
	   countWord += wordList.length; 
	   } 
	  }System.out.println("Total word count = " + countWord); 
	  System.out.println("Total characters = " + characterCount);
	  //for(int j=0;j<line.length();j++)
	 // {
	  System.out.println("string = " + wordList[]);
	  //}
	    /* char ch[] = s.toCharArray();
	     for (int i = 0; i < s.length(); i++)
	     {
	     f1.write(ch[i]); 
	     }
	    //System.out.println("data added");
	    //write
	    int i=0;
	    FileInputStream fin = new FileInputStream("numbers.txt");
	  //  System.out.println(fin.available()); // available bytes
	    // read till the end of the stream
	    while((i=fin.read())!=-1) {
	    //Converts Byte to Character
	    char c = (char)i;
	    System.out.print(c);
	    //int a=Character.getNumericValue(c);
	    if(c%2==0)
	    {
	    	//System.out.print(a);
	    	f2.write(c);
	    	
	    }
	    else
	    {
	    	f3.write(c);
	    		
	    }
		    int z=0;
		    System.out.println("even numbers");
		    FileInputStream fev = new FileInputStream("even.txt");
		   // System.out.println(fin.available()); // available bytes
		    // read till the end of the stream
		   
		    while((z=fev.read())!=-1) {
		    //Converts Byte to Character
		    char u = (char)z;
		    System.out.print(u);
		    }
		   
		    System.out.println("odd numbers");
		    int x=0;
		    FileInputStream fod = new FileInputStream("odd.txt");
		   // System.out.println(fin.available()); // available bytes
		    // read till the end of the stream
		    
		    while((x=fod.read())!=-1) {
		    //Converts Byte to Character
		    char y = (char)x;
		    System.out.print(y);
	}
	    
	    

}*/
}
}

