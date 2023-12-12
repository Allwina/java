package myjava;

import java.util.*;

public class ReplaceString 
  {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("enter the word to be replaced");
	    String ow=in.nextLine();
	    System.out.println("enter the word to be placed");
	    String nw=in.nextLine();
	    System.out.println("enter the sentence");        
        String s=in.nextLine();
        if(s.contains(ow))
        {
		
		 System.out.println(s.replace(ow, nw));

}
        else
        {
        	System.out.println("word not found");
}
        in.close();
  }
  }