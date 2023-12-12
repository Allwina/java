package myjava;
import java.util.*;
public class word {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String t=" ";
		System.out.println("enter the word to be checked");
		while(true)
		{
			String s=in.next();
			int l=s.length();
			for(int i=l-1;i>=0;i--)
			{
				t=t+(s.charAt(i));
			}
			if(s.equals(t))
				System.out.pritln()
		}
	}

}
