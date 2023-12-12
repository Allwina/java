package myjava;
import java.util.*;
public class Max_MinArray {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.println("Enter the max number of rows");
		int r=in.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			ar[i]=in.nextInt();
		}
		int max=ar[0];
		for(int i=0;i<r;i++) {
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("The max element : "+max);
	}

}
