package myjava;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s,t,q="";
		System.out.println("enter the string");
		s=in.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			t=st.nextToken();
			int l=t.length();
			for(int i=l-1;i>=0;i--)
			{
				q=q+t.charAt(i);
			}
			if(q.equals(s))
				System.out.println("palindrome");
			else
				System.out.println("not");
		}
		// TODO Auto-generated method stub

	}

}
