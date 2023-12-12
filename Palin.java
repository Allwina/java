package primepackage;
import java.util.*;
public class Palin {
	public static void main(String args[])
	{
	Scanner in= new Scanner(System.in);
	int a,sum=0,n,p;
	System.out.println("enter the number");
	n=in.nextInt();
	p=n;
	while(n>0)
	{
		a=n%10;
		sum=sum*10+a;
		n=n/10;
	}
	if(p==sum)
	System.out.println("Palindrome");
	else
		System.out.println("Not");


}
}
