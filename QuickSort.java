package myjava;
import java.util.*;
public class QuickSort {
	static void QuickSort(String arr[],int low,int high)
	{
		int mid=(low+high)/2;
		int i=low;
		int j=high;
		String pivot=arr[mid];
		while(i<=j)
		{
			while(arr[i].compareTo(pivot)<0)
			{
				i++;
			}
			while(arr[j].compareTo(pivot)>0)
			{
				j--;
			}
			if(i<=j)
			{
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
		{
			QuickSort(arr,low,j);
		}
		if(high>i)
		{
			QuickSort(arr,i,high);
		}
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sizeof array");
		int n=in.nextInt();
		String arr[]= new String[n+1];
		System.out.println("Enter the unsorted array elements");
		for(int i=0;i<=n;i++)
		{
			arr[i]=in.nextLine();
		}
		System.out.println("Before QuickSort");
		for(int i=0;i<=n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		QuickSort(arr,0,n);
		System.out.println("After QuickSort");
		for(int i=0;i<=n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
